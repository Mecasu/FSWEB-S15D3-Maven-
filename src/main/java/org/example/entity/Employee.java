package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Objects.equals(getFirstname(), employee.getFirstname()) && Objects.equals(getLastname(), employee.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastname());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                '}';
    }


}
