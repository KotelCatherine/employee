package ru.geekbrains.emp;

public class FixedPayEmployee extends Employee implements Comparable<Employee> {

    public FixedPayEmployee(String name, double sum) {
        super(name, sum);
    }

    @Override
    public double payrollSalary(double sum) {
        return sum;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getSum() {
        return super.getSum();
    }

    @Override
    public void setSum(double sum) {
        super.setSum(sum);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", salary: " + String.format("%.2f", payrollSalary(sum));
    }
}
