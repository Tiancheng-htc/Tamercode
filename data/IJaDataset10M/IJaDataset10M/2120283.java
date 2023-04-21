package users;

import java.io.*;

/**
  * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
  * The usage of generated code is restricted to OpenSource software projects
  * only. DaoGen is available in http://titaniclinux.net/daogen/
  * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
  *
  * DaoGen license: The following DaoGen generated source code is licensed
  * under the terms of GNU GPL license. The full text for license is available
  * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
  *
  * If you wish to use the DaoGen generator to produce code for closed-source
  * commercial applications, you must pay the lisence fee. The price is
  * 5 USD or 5 Eur for each database table, you are generating code for.
  * (That includes unlimited amount of iterations with all supported languages
  * for each database table you are paying for.) Send mail to
  * "Tuomo.Lukka@iki.fi" for more information. Thank you!
  */
public class SNUTypeHasAttribute implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int idSNUType;

    private int idAttribute;

    private String idAttributeName;

    private String idTimeStart;

    private String idTimeEnd;

    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */
    public SNUTypeHasAttribute() {
    }

    public SNUTypeHasAttribute(int idSNUTypeIn, int idAttributeIn, String idAttributeNameIn) {
        this.idSNUType = idSNUTypeIn;
        this.idAttribute = idAttributeIn;
        this.idAttributeName = idAttributeNameIn;
    }

    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */
    public int getIdSNUType() {
        return this.idSNUType;
    }

    public void setIdSNUType(int idSNUTypeIn) {
        this.idSNUType = idSNUTypeIn;
    }

    public int getIdAttribute() {
        return this.idAttribute;
    }

    public void setIdAttribute(int idAttributeIn) {
        this.idAttribute = idAttributeIn;
    }

    public String getIdAttributeName() {
        return this.idAttributeName;
    }

    public void setIdAttributeName(String idAttributeNameIn) {
        this.idAttributeName = idAttributeNameIn;
    }

    public String getIdTimeStart() {
        return this.idTimeStart;
    }

    public void setIdTimeStart(String idTimeStartIn) {
        this.idTimeStart = idTimeStartIn;
    }

    public String getIdTimeEnd() {
        return this.idTimeEnd;
    }

    public void setIdTimeEnd(String idTimeEndIn) {
        this.idTimeEnd = idTimeEndIn;
    }

    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */
    public void setAll(int idSNUTypeIn, int idAttributeIn, String idAttributeNameIn, String idTimeStartIn, String idTimeEndIn) {
        this.idSNUType = idSNUTypeIn;
        this.idAttribute = idAttributeIn;
        this.idAttributeName = idAttributeNameIn;
        this.idTimeStart = idTimeStartIn;
        this.idTimeEnd = idTimeEndIn;
    }

    /** 
     * hasEqualMapping-method will compare two SNUTypeHasAttribute instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(SNUTypeHasAttribute valueObject) {
        if (valueObject.getIdSNUType() != this.idSNUType) {
            return (false);
        }
        if (valueObject.getIdAttribute() != this.idAttribute) {
            return (false);
        }
        if (!valueObject.getIdAttributeName().equals(this.idAttributeName)) {
            return (false);
        }
        if (this.idTimeStart == null) {
            if (valueObject.getIdTimeStart() != null) return (false);
        } else if (!this.idTimeStart.equals(valueObject.getIdTimeStart())) {
            return (false);
        }
        if (this.idTimeEnd == null) {
            if (valueObject.getIdTimeEnd() != null) return (false);
        } else if (!this.idTimeEnd.equals(valueObject.getIdTimeEnd())) {
            return (false);
        }
        return true;
    }

    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer(this.getDaogenVersion());
        out.append("\nclass SNUTypeHasAttribute, mapping to table SNUTypeHasAttribute\n");
        out.append("Persistent attributes: \n");
        out.append("idSNUType = " + this.idSNUType + "\n");
        out.append("idAttribute = " + this.idAttribute + "\n");
        out.append("idAttributeName = " + this.idAttributeName + "\n");
        out.append("idTimeStart = " + this.idTimeStart + "\n");
        out.append("idTimeEnd = " + this.idTimeEnd + "\n");
        return out.toString();
    }

    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        SNUTypeHasAttribute cloned = new SNUTypeHasAttribute();
        cloned.setIdSNUType(this.idSNUType);
        cloned.setIdAttribute(this.idAttribute);
        cloned.setIdAttributeName(this.idAttributeName);
        if (this.idTimeStart != null) cloned.setIdTimeStart(new String(this.idTimeStart));
        if (this.idTimeEnd != null) cloned.setIdTimeEnd(new String(this.idTimeEnd));
        return cloned;
    }

    /** 
     * getDaogenVersion will return information about
     * generator which created these sources.
     */
    public String getDaogenVersion() {
        return "DaoGen version 2.4.1";
    }
}