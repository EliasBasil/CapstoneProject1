import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;

    public Employee(String fullName, int department, double salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", full name: " + fullName + ", department: " + department + ", salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    public String printEmployeeWithoutDepartment() {
        return "id: " + id + ", full name: " + fullName + ", salary: " + salary;
    }
}
