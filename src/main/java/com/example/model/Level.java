package com.example.model;

import java.util.List;

public class Level {
    private String id;
    private String name;
    private List<String> gradeIds;

    public Level(String id, String name, List<String> gradeIds) {
        this.id = id;
        this.name = name;
        this.gradeIds = gradeIds;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getGradeIds() {
        return gradeIds;
    }

    @Override
    public String toString() {
        return "Level{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", gradeIds=" + gradeIds +
            '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Level level = (Level) o;

        if (id != null ? !id.equals(level.id) : level.id != null)
            return false;
        if (name != null ? !name.equals(level.name) : level.name != null)
            return false;
        return gradeIds != null ? gradeIds.equals(level.gradeIds) : level.gradeIds == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gradeIds != null ? gradeIds.hashCode() : 0);
        return result;
    }
}
