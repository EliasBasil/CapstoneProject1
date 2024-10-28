public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int pointer = 0;


    public void printAllEmployees() {
        for (int i = 0; i < pointer; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean addEmployee(String fullName, int department, double salary) {
        if (employees.length == pointer) {
            return false;
        } else {
            employees[pointer] = new Employee(fullName, department, salary);
            pointer++;
            return true;
        }
    }

    public void deleteEmployee(int idToDelete) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getId() == idToDelete) {
                for (int j = i + 1; j < pointer; j++) {
                    employees[j - 1] = employees[j];
                }
                pointer--;
                employees[pointer] = null;
                break;
            }
        }
    }

    public Employee getEmployeeByID(int id) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new RuntimeException("No employee with this ID found");
    }

    public double getTotalSalaries() {
        double sum = 0.0;
        for (int i = 0; i < pointer; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee getEmployeeWithMinimalSalary() {
        Employee employeeWithMinimalSalary = employees[0];
        for (int i = 1; i < pointer; i++) {
            if (employees[i].getSalary() < employeeWithMinimalSalary.getSalary()) {
                employeeWithMinimalSalary = employees[i];
            }
        }
        return employeeWithMinimalSalary;
    }

    public Employee getEmployeeWithMaximalSalary() {
        Employee employeeWithMaximalSalary = employees[0];
        for (int i = 1; i < pointer; i++) {
            if (employees[i].getSalary() > employeeWithMaximalSalary.getSalary()) {
                employeeWithMaximalSalary = employees[i];
            }
        }
        return employeeWithMaximalSalary;
    }

    public double getAverageSalary() {
        if (pointer == 0) {
            return 0;
        } else {
            return getTotalSalaries() / pointer;
        }
    }

    public void printAllFullNames() {
        for (int i = 0; i < pointer; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void indexSalaries(double indexation) {
        for (int i = 0; i < pointer; i++) {
            employees[i].setSalary(employees[i].getSalary() * (1 + indexation));
        }
    }

    public Employee getEmployeeWithMinimalSalaryInDepartment(int department) {
        Employee nullEmployee = null;
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department &&
                    (nullEmployee == null || employees[i].getSalary() < nullEmployee.getSalary())) {
                nullEmployee = employees[i];
            }
        }
        return nullEmployee;
    }

    public Employee getEmployeeWithMaximalSalaryInDepartment(int department) {
        Employee nullEmployee = null;
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department &&
                    (nullEmployee == null || employees[i].getSalary() > nullEmployee.getSalary())) {
                nullEmployee = employees[i];
            }
        }
        return nullEmployee;
    }

    public double getTotalSalariesInDepartment(int department) {
        double sum = 0.0;
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double getAverageSalaryInDepartment(int department) {
        double sum = 0.0;
        int departmentCounter = 0;
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department) {
                departmentCounter++;
                sum += employees[i].getSalary();
            }
        }
        if (departmentCounter == 0) {
            return 0;
        } else {
            return sum / departmentCounter;
        }
    }

    public void indexSalariesInDepartment(double indexation, int department) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * (1 + indexation));
            }
        }
    }

    public void printAllEmployeesInDepartment(int department) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringEmployeeWithoutDepartment());
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double exampleSalary) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getSalary() < exampleSalary) {
                System.out.println(employees[i].toStringEmployeeWithoutDepartment());
            }
        }
    }

    public void printEmployeesWithSalaryMoreThan(double exampleSalary) {
        for (int i = 0; i < pointer; i++) {
            if (employees[i].getSalary() >= exampleSalary) {
                System.out.println(employees[i].toStringEmployeeWithoutDepartment());
            }
        }
    }
}
