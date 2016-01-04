package com.example.model;

import java.util.*;

import static java.util.Collections.emptyList;

public class TreeNode<T> {
    private String description;
    private List<TreeNode<T>> children = emptyList();
    private Optional<LogicalOperator> logicalOperator = Optional.empty();
    private Optional<T> criteria = Optional.empty();

    public TreeNode(String description, List<TreeNode<T>> children, Optional<LogicalOperator> logicalOperator) {
        this.description = description;
        this.children = children;
    }

    public TreeNode(String description, Optional<T> criteria) {
        this.description = description;
        this.criteria = criteria;
    }

    public String getDescription() {
        return description;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public Optional<T> getCriteria() {
        return criteria;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
            "description='" + description + '\'' +
            ", children=" + children +
            ", criteria=" + criteria +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        TreeNode<?> treeNode = (TreeNode<?>) o;

        if (description != null ? !description.equals(treeNode.description) : treeNode.description != null)
            return false;
        if (children != null ? !children.equals(treeNode.children) : treeNode.children != null)
            return false;
        return criteria != null ? criteria.equals(treeNode.criteria) : treeNode.criteria == null;

    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (children != null ? children.hashCode() : 0);
        result = 31 * result + (criteria != null ? criteria.hashCode() : 0);
        return result;
    }
}
