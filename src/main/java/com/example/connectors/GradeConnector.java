package com.example.connectors;

import com.example.model.Grade;

import java.util.List;

import static java.util.Arrays.asList;

public class GradeConnector {
    public List<Grade> findAll() {
        return asList(
            new Grade("grade id 1", "F-"),
            new Grade("grade id 2", "A+"),
            new Grade("grade id 3", "Fail"),
            new Grade("grade id 4", "Pass")
        );
    }
}
