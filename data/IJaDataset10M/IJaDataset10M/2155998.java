package com.ibm.wala.dila.tests.instrumentation.cg;

import com.ibm.wala.dila.tests.TestBase;

/**
 *
 * @author Jan Wloka
 * @version $Id: TestLocalClasses.java,v 1.2 2008/10/08 21:21:10 jwloka Exp $
 */
public class TestLocalClasses extends TestBase {

    @Override
    protected String getTestPackage() {
        return "com.ibm.wala.dila.tests.data.callgraph";
    }

    @Override
    protected void setUp() throws Exception {
        runDila();
    }

    public void testCallGraphChiantiInnerClasses1() throws Throwable {
        assertNodes(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.<init>()V", "Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.m1()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1;.main([Ljava/lang/String;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;.foo()V"));
        assertEdges(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;)V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.m1()V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$I;.foo()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;.foo()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1;.main([Ljava/lang/String;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.<init>()V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1;.main([Ljava/lang/String;)V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.m1()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.m1()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;.m1()V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A$1;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses1$A;)V"));
    }

    public void testCallGraphChiantiInnerClasses2() throws Throwable {
        assertNodes(createStringSet("Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.bar()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2;.main([Ljava/lang/String;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$B;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.m2()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.<init>()V"));
        assertEdges(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.m2()V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$B;.<init>()V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$B;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.m2()V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.bar()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A$2;.bar()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2;.main([Ljava/lang/String;)V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.m2()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.m2()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.<init>()V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2;.main([Ljava/lang/String;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses2$A;.<init>()V"));
    }

    public void testCallGraphChiantiInnerClasses3() throws Throwable {
        assertNodes(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.foo()V", "Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3;.main([Ljava/lang/String;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.m3()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.<init>()V"));
        assertEdges(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.m3()V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.<init>()V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3;.main([Ljava/lang/String;)V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.m3()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.m3()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;)V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3;.main([Ljava/lang/String;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A;.m3()V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.foo()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses3$A$1TempI;.foo()V"));
    }

    public void testCallGraphChiantiInnerClasses4() throws Throwable {
        assertNodes(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.m4()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;.bar()V", "Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$B;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4;.main([Ljava/lang/String;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;)V"));
        assertEdges(createStringSet("Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4;.main([Ljava/lang/String;)V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.m4()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.m4()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.m4()V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;)V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.m4()V --> [#receiver:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;#static:Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$B;.bar()V]Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;.bar()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A$1TempB;.<init>(Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$B;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$B;.<init>()V --> Ljava/lang/Object;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4;.main([Ljava/lang/String;)V --> Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.<init>()V", "Lcom/ibm/wala/dila/tests/data/callgraph/CallGraphChiantiInnerClasses4$A;.<init>()V --> Ljava/lang/Object;.<init>()V"));
    }
}