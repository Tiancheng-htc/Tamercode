package p5.MasterMindApp;

/**
* MasterMindApp/ResultadoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mastermind.idl
* jueves 15 de febrero de 2007 11H43' CET
*/
public abstract class ResultadoHelper {

    private static String _id = "IDL:MasterMindApp/Resultado/Resultado:1.0";

    public static void insert(org.omg.CORBA.Any a, p5.MasterMindApp.Resultado that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static p5.MasterMindApp.Resultado extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    private static boolean __active = false;

    public static synchronized org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            synchronized (org.omg.CORBA.TypeCode.class) {
                if (__typeCode == null) {
                    if (__active) {
                        return org.omg.CORBA.ORB.init().create_recursive_tc(_id);
                    }
                    __active = true;
                    org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[2];
                    org.omg.CORBA.TypeCode _tcOf_members0 = null;
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
                    _members0[0] = new org.omg.CORBA.StructMember("weak", _tcOf_members0, null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
                    _members0[1] = new org.omg.CORBA.StructMember("strong", _tcOf_members0, null);
                    __typeCode = org.omg.CORBA.ORB.init().create_struct_tc(p5.MasterMindApp.ResultadoHelper.id(), "Resultado", _members0);
                    __active = false;
                }
            }
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static p5.MasterMindApp.Resultado read(org.omg.CORBA.portable.InputStream istream) {
        p5.MasterMindApp.Resultado value = new p5.MasterMindApp.Resultado();
        value.weak = istream.read_double();
        value.strong = istream.read_double();
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, p5.MasterMindApp.Resultado value) {
        ostream.write_double(value.weak);
        ostream.write_double(value.strong);
    }
}