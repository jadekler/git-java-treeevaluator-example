package com.example.model;

public class Grade {
    private String id;
    private String name;

    public Grade(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Grade{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Grade grade = (Grade) o;

        if (id != null ? !id.equals(grade.id) : grade.id != null)
            return false;
        return name != null ? name.equals(grade.name) : grade.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
