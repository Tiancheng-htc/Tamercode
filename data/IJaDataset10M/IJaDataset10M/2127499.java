package net.sourceforge.pmd.lang.java.ast;

public class ASTConstructorDeclaration extends AbstractJavaAccessNode {

    public ASTConstructorDeclaration(int id) {
        super(id);
    }

    public ASTConstructorDeclaration(JavaParser p, int id) {
        super(p, id);
    }

    public ASTFormalParameters getParameters() {
        return (ASTFormalParameters) (jjtGetChild(0) instanceof ASTFormalParameters ? jjtGetChild(0) : jjtGetChild(1));
    }

    public int getParameterCount() {
        return getParameters().getParameterCount();
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    private boolean containsComment;

    public boolean containsComment() {
        return this.containsComment;
    }

    public void setContainsComment() {
        this.containsComment = true;
    }
}