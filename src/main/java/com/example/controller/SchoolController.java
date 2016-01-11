package com.example.controller;

import com.example.connector.*;
import com.example.model.*;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

@RestController
public class SchoolController {
    @Autowired private SchoolConnector schoolConnector;
    @Autowired private SubjectConnector subjectConnector;
    @Autowired private LevelConnector levelConnector;
    @Autowired private GradeConnector gradeConnector;

    @Autowired private TreeBuilder treeBuilder;
    @Autowired private TreeEvaluator<Grade> treeEvaluator;

    @RequestMapping("/schools")
    public List<School> getSchoolsWithGrades(@RequestParam String commaSeparatedGrades) {
        List<String> wantedGrades = asList(commaSeparatedGrades.split(","));

        final List<School> allSchools = schoolConnector.findAll();
        final List<Subject> allSubjects = subjectConnector.findAll();
        final List<Level> allLevels = levelConnector.findAll();
        final List<Grade> allGrades = gradeConnector.findAll();

        return allSchools.stream()
            .filter(school -> {
                TreeNode<Grade> root = treeBuilder.build(school, allSubjects, allLevels, allGrades);
                return treeEvaluator.isValid(root, grade -> wantedGrades.contains(grade.getName()));
            })
            .collect(toList());
    }
}
