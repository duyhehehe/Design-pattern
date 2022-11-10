import java.util.ArrayList;
import java.util.List;

public class Boss extends Employee {
    private List<Employee> employeeList = new ArrayList<>();

    public Boss(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("=====================");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        for (Employee employee : employeeList) {
            employee.print();
        }
    }
}
