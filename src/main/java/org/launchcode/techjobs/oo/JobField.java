package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private int nextId = 1;
    private String value;

    public JobField(String value) {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        JobField jobfield = (JobField) o;
        return getId() == jobfield.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
