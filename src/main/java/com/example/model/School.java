package com.example.model;

import java.util.List;

public class School {
    private String id;
    private String name;
    private List<String> subjectIds;

    public School(String id, String name, List<String> subjectIds) {
        this.id = id;
        this.name = name;
        this.subjectIds = subjectIds;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjectIds() {
        return subjectIds;
    }

    @Override
    public String toString() {
        return "School{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", subjectIds=" + subjectIds +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        School school = (School) o;

        if (id != null ? !id.equals(school.id) : school.id != null)
            return false;
        if (name != null ? !name.equals(school.name) : school.name != null)
            return false;
        return subjectIds != null ? subjectIds.equals(school.subjectIds) : school.subjectIds == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (subjectIds != null ? subjectIds.hashCode() : 0);
        return result;
    }
}
