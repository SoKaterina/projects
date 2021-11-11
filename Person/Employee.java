package com.MyProg.Person;

import com.MyProg.figure.Triangle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee c = (Employee) o;
        return getId() == c.getId() && getSalary() == c.getSalary() && Objects.equals(getFirstName(),c.getFirstName()) && Objects.equals(getLastName(),c.getLastName());
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + id;
        result = 31*result + salary;
        result = 31*result + Objects.hashCode(firstName);
        result = 31*result + Objects.hashCode(lastName);

        return result;
    }
}
