package org.eclipse.jface.viewers;

import org.eclipse.jface.util.Util;

/**
public class TreeNode {

    /**
    private TreeNode[] children;

    /**
    private TreeNode parent;

    /**
    protected Object value;

    /**
    public TreeNode(final Object value) {
        this.value = value;
    }

    public boolean equals(final Object object) {
        if (object instanceof TreeNode) {
            return Util.equals(this.value, ((TreeNode) object).value);
        }
        return false;
    }

    /**
    public TreeNode[] getChildren() {
        if (children != null && children.length == 0) {
            return null;
        }
        return children;
    }

    /**
    public TreeNode getParent() {
        return parent;
    }

    /**
    public Object getValue() {
        return value;
    }

    /**
    public boolean hasChildren() {
        return children != null && children.length > 0;
    }

    public int hashCode() {
        return Util.hashCode(value);
    }

    /**
    public void setChildren(final TreeNode[] children) {
        this.children = children;
    }

    /**
    public void setParent(final TreeNode parent) {
        this.parent = parent;
    }
}