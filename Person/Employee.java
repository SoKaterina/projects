package com.MyProg.Person;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        int GAS = 12 * salary;
        return GAS;
    }

    public int raiseSalary(int percent) {
        int RS = salary + salary * percent / 100;
        return RS;
    }

    public String toString(){
        return "Employee {id = "+id+", name = "+this.getName()+", salary = "+salary+"}";
    }

}
