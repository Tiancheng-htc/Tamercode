package org.owasp.orizon.translator;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import org.owasp.orizon.O;
import org.owasp.orizon.core.Cons;
import org.owasp.orizon.xml.Keywords;
import org.w3c.dom.Node;

/**
 * This class is a default class for a translator. Translators will translate a
 * generic source file into one or more XML files containing information to be
 * used by Orizon framework.
 * 
 * @author thesp0nge
 * @since 0.99
 */
public abstract class DefaultTranslator extends O {

    protected boolean scanned, canWrite;

    protected OutputStreamWriter out;

    protected OutputStream xmlFile, bout;

    public DefaultTranslator() {
        super(DefaultTranslator.class);
        scanned = false;
        canWrite = false;
    }

    protected final boolean isGoodService(int service) {
        boolean ret = false;
        switch(service) {
            case Cons.OC_TRANSLATOR_CF:
            case Cons.OC_TRANSLATOR_CG:
            case Cons.OC_TRANSLATOR_DF:
            case Cons.OC_TRANSLATOR_STAT:
                ret = true;
                break;
            default:
                ret = false;
        }
        return ret;
    }

    /**
	 * Scan the source file retrieving information to be used in creating XML
	 * files
	 * 
	 * @param in
	 *            the input file name
	 * @return <i>true</i> if the source file has been scanned, <i>false</i>
	 *         otherwise
	 */
    public abstract boolean scan(String in);

    public abstract boolean statService(String in, String out);

    public abstract boolean callGraphService(String in, String out);

    public abstract boolean dataFlowService(String in, String out);

    public abstract boolean controlFlowService(String in, String out);

    public abstract boolean designService(String in, String out);

    public abstract boolean keywordService(String in, String out);

    /**
	 * Translates the input file into an XML file.
	 * 
	 * The parameter <code>service</code> tells the information to be contained
	 * into the output file.
	 * 
	 * Good values for <code>service</code> are:
	 * <ul>
	 * <li>org.owasp.orizon.Cons.OC_TRANSLATOR_STAT - to generate XML file
	 * containing statistics</li>
	 * <li>org.owasp.orizon.Cons.OC_TRANSLATOR_CF - to generate XML file
	 * containing program control flow</li>
	 * <li>org.owasp.orizon.Cons.OC_TRANSLATOR_CG - to generate XML file
	 * containing call graph</li>
	 * <li>org.owasp.orizon.Cons.OC_TRANSLATOR_DF - to generate XML file
	 * containing data flow</li>
	 * </ul>
	 * 
	 * @param in
	 *            the input file name
	 * @param out
	 *            the output file name
	 * @param service
	 *            the service to be performed
	 * @return <i>true</i> if the XML file has been generated or <i>false</i>
	 *         otherwise.
	 */
    public final boolean translate(String in, String out, int service) {
        if (!isGoodService(service)) return false;
        if (!scanned) if (!scan(in)) return log.error(in + ": scan has been failed");
        switch(service) {
            case Cons.OC_TRANSLATOR_STAT:
                return statService(in, out);
            case Cons.OC_TRANSLATOR_CF:
                return controlFlowService(in, out);
            case Cons.OC_TRANSLATOR_CG:
                return callGraphService(in, out);
            case Cons.OC_TRANSLATOR_DF:
                return dataFlowService(in, out);
            case Cons.OC_TRANSLATOR_DESIGN:
                return designService(in, out);
            case Cons.OC_TRANSLATOR_KEYWORD:
                return keywordService(in, out);
            default:
                return log.error("unknown service code");
        }
    }

    protected boolean serviceNotSupportedStub() {
        return log.error("the requested service is not yet implemented for this programming language");
    }

    protected void createXmlFile(String filename) throws FileNotFoundException, UnsupportedEncodingException {
        xmlFile = new FileOutputStream(filename);
        bout = new BufferedOutputStream(xmlFile);
        out = new OutputStreamWriter(bout, "8859_1");
    }

    protected boolean xmlInit() throws IOException {
        out.write(Keywords.XML_PREAMBLE + "\n");
        out.write("<!-- generated by " + org.owasp.orizon.About.about() + " -->\n");
        out.flush();
        return true;
    }

    private String sanitize(String s, boolean xmlEscape) {
        String ret = "";
        int j = 0;
        if (xmlEscape) s = s.replace("\"", "");
        try {
            for (int i = 0; i < s.length(); i++) {
                ret += s.charAt(i);
                if ((s.charAt(i) == '\"') && (s.charAt(i + 1) == '\"')) {
                    switch(s.charAt(i + 2)) {
                        case ' ':
                        case '/':
                        case '>':
                            if (s.charAt(i - 1) != '=') i++;
                            break;
                        default:
                            i++;
                            break;
                    }
                }
                j++;
            }
        } catch (IndexOutOfBoundsException ex) {
            log.debug("sanitize(): " + s + "(" + ex.getMessage() + ").");
        }
        return ret;
    }

    /**
	 * Handling " in string
	 * @param s
	 * @return
	 */
    private String sanitize(String s) {
        return sanitize(s, false);
    }

    protected boolean xml(String toWrite) {
        try {
            out.write(sanitize(toWrite) + "\n");
            out.flush();
        } catch (IOException e) {
            return log.error("an exception occured while writing XML code: " + e.getMessage());
        }
        return true;
    }

    protected boolean xmlEnd() throws IOException {
        out.close();
        bout.close();
        xmlFile.close();
        return true;
    }

    @Override
    public boolean readXmlNode(Node n) {
        return false;
    }
}