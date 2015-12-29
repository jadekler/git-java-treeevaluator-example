package com.example.model;

import java.util.List;

public class Subject {
    private String id;
    private String name;
    private List<String> levelIds;

    public Subject(String id, String name, List<String> levelIds) {
        this.id = id;
        this.name = name;
        this.levelIds = levelIds;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getLevelIds() {
        return levelIds;
    }

    @Override
    public String toString() {
        return "Subject{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", levelIds=" + levelIds +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Subject subject = (Subject) o;

        if (id != null ? !id.equals(subject.id) : subject.id != null)
            return false;
        if (name != null ? !name.equals(subject.name) : subject.name != null)
            return false;
        return levelIds != null ? levelIds.equals(subject.levelIds) : subject.levelIds == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (levelIds != null ? levelIds.hashCode() : 0);
        return result;
    }
}
