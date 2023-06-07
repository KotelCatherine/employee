package output;

import ru.geekbrains.emp.Employee;
import ru.geekbrains.emp.FixedPayEmployee;
import ru.geekbrains.emp.HourlyWageEmployee;

import java.util.ArrayList;
import java.util.List;

public class OutputOnDisplay {

    public static List<Employee> employeeList(){
        Employee emp1 = new FixedPayEmployee("Kate", 25000);
        Employee emp2 = new HourlyWageEmployee("Daniel", 250.50);
        Employee emp3 = new HourlyWageEmployee("Alex", 101.25);
        Employee emp4 = new FixedPayEmployee("Jon", 65000.8);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }


}
