import output.OutputOnDisplay;
import ru.geekbrains.emp.Employee;
import ru.geekbrains.emp.MaxSalary;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgrammApp {

    public static void main(String[] args) {

        List<Employee> employees = OutputOnDisplay.employeeList();
        Collections.sort(employees);

        for (Employee e: employees) {
            System.out.println(e);
        }

        Comparator<Employee> comparator = new MaxSalary();
        Collections.sort(employees, comparator);

        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
