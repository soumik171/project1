package info;

public class Employee {

    private int id;
    private String empName;
    private String salary;

    public Employee(int id, String empName, String salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return empName;
    }

    public String getSalary() {
        return salary;
    }

}
