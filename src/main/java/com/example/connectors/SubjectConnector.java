package com.example.connectors;

import com.example.model.Subject;

import java.util.List;

import static java.util.Arrays.asList;

public class SubjectConnector {
    public List<Subject> findAll() {
        return asList(
            new Subject("subject id 1", "Biology", asList("level id 1")),
            new Subject("subject id 2", "Mathematics", asList("level id 2", "level id 3")),
            new Subject("subject id 3", "Literature", asList("level id 3")),
            new Subject("subject id 4", "Geography", asList("level id 4"))
        );
    }
}
