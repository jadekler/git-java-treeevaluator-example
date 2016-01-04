package com.example.connector;

import com.example.model.Grade;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
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
