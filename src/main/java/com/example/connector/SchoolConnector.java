package com.example.connector;

import com.example.model.School;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class SchoolConnector {
    public List<School> findAll() {
        return asList(
            new School("school id 1", "Harvard University", asList("subject id 1", "subject id 2")),
            new School("school id 2", "Cambridge University", asList("subject id 2")),
            new School("school id 3", "Oxford University", asList("subject id 3")),
            new School("school id 4", "Yale University", asList("subject id 4"))
        );
    }
}
