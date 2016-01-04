package com.example.connector;

import com.example.model.Level;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class LevelConnector {
    public List<Level> findAll() {
        return asList(
            new Level("level id 1", "Advanced Placement (AP)", asList("grade id 1")),
            new Level("level id 2", "Honors", asList("grade id 2")),
            new Level("level id 3", "Regular", asList("grade id 3", "grade id 4")),
            new Level("level id 4", "Credit", asList("grade id 4"))
        );
    }
}
