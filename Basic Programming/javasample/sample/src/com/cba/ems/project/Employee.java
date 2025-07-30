package com.cba.ems.project;

public class Employee {
    private int Id;
    private String firstName;
    private String lastName;
    public Employee(int id, String firstName, String lastName) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
}


