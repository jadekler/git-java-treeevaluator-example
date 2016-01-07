package com.example.service;

import com.example.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

import static com.example.model.LogicalOperator.AND;
import static java.util.stream.Collectors.toList;

@Service
public class TreeBuilder {
    public TreeNode<Grade> build(
        School school,
        List<Subject> allSubjects,
        List<Level> allLevels,
        List<Grade> allGrades
    ) {
        List<String> subjectIds = school.getSubjectIds();

        List<TreeNode<Grade>> schoolChildren = allSubjects.stream()
            .filter(subjectIds::contains)
            .map(subject -> {
                List<String> levelIds = subject.getLevelIds();

                List<TreeNode<Grade>> subjectChildren = allLevels.stream()
                    .filter(levelIds::contains)
                    .map(level -> {
                        List<String> gradeIds = level.getGradeIds();

                        List<TreeNode<Grade>> levelChildren = allGrades.stream()
                            .filter(gradeIds::contains)
                            .map(grade -> new TreeNode<>(grade.getId(), Optional.of(grade)))
                            .collect(toList());

                        return new TreeNode<>(level.getId(), levelChildren, Optional.of(AND));
                    })
                    .collect(toList());

                return new TreeNode<>(subject.getId(), subjectChildren, Optional.of(AND));
            })
            .collect(toList());

        return new TreeNode<>(school.getId(), schoolChildren, Optional.of(AND));
    }
}
