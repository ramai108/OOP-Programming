package Inheritance;

import Inheritance.Employee;

public class PaidEmployee extends Employee {

    private double salary;

    public PaidEmployee(String name, String id, double salary) {
        super(name,id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PaidEmployee{" +
                "salary=" + salary +
                '}';
    }
}
