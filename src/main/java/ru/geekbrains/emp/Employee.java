package ru.geekbrains.emp;

public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected double sum;

    public Employee(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }

    public abstract double payrollSalary(double sum);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}