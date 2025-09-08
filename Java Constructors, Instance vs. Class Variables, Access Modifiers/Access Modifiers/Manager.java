package AccessModifiers;

public class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team Name: " + teamName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployeeDetails();
        e1.setSalary(45000);
        e1.displayEmployeeDetails();

        Manager m1 = new Manager(201, "IT", 60000, "Development");
        m1.displayManagerDetails();
    }
}
