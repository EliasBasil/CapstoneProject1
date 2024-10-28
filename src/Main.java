public class Main {
    public static void main(String[] args) {
        // Курсовая сделана по уровню "Очень сложно"
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Ivan Ivanov", 1, 12_000);
        employeeBook.addEmployee("Nadezhda Nadezhdina", 3, 15_000);
        employeeBook.addEmployee("Petr Petrov", 1, 17_000);
        employeeBook.addEmployee("Aleksandra Aleksandrova", 1, 10_000);
        employeeBook.addEmployee("Sidor Sidorov", 4, 20_000);
        employeeBook.addEmployee("Alena Alenova", 3, 24_000);

        employeeBook.printAllEmployees();
        System.out.println(employeeBook.getTotalSalaries());
        System.out.println(employeeBook.getEmployeeWithMinimalSalary());
        System.out.println(employeeBook.getEmployeeWithMaximalSalary());
        System.out.println(employeeBook.getAverageSalary());
        employeeBook.printAllFullNames();
        employeeBook.indexSalaries(0.07);

        System.out.println();
        employeeBook.printAllEmployees();
        System.out.println();

        System.out.println(employeeBook.getEmployeeWithMinimalSalaryInDepartment(1));
        System.out.println(employeeBook.getEmployeeWithMaximalSalaryInDepartment(1));
        System.out.println(employeeBook.getTotalSalariesInDepartment(1));
        System.out.println(employeeBook.getAverageSalaryInDepartment(1));
        System.out.println();

        employeeBook.indexSalariesInDepartment(0.05, 1);
        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.printAllEmployeesInDepartment(1);
        System.out.println();

        employeeBook.printEmployeesWithSalaryLessThan(15_000);
        System.out.println();

        employeeBook.printEmployeesWithSalaryMoreThan(15_000);
        System.out.println();

        employeeBook.deleteEmployee(2);
        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.addEmployee("Vasiliy Vasiliev", 4, 30_000);
        employeeBook.printAllEmployees();
        System.out.println();

        System.out.println(employeeBook.getEmployeeByID(3));
    }


}