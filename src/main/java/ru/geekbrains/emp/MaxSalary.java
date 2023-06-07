package ru.geekbrains.emp;

import java.util.Comparator;

public class MaxSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee emp0, Employee emp1) {
        return (int) (emp0.payrollSalary(emp0.sum) - emp1.payrollSalary(emp1.sum));
    }
}
