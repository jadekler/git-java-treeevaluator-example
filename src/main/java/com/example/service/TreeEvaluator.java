package com.example.service;

import com.example.model.*;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TreeEvaluator<T> {
    public boolean isValid(TreeNode<T> treeNode, Function<T, Boolean> criteriaFunction) {
        if (treeNode.getCriteria().isPresent()) {
            // leaf

            return criteriaFunction.apply(treeNode.getCriteria().get());
        } else {
            // branch

            if (treeNode.getLogicalOperator().get().equals(LogicalOperator.AND)) {
                return treeNode.getChildren().stream()
                    .allMatch(child -> isValid(child, criteriaFunction));
            } else {
                return treeNode.getChildren().stream()
                    .anyMatch(child -> isValid(child, criteriaFunction));
            }
        }
    }
}
