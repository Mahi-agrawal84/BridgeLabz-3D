package CombinedEncapsulationInheritancePolymorphism;
public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Manager(1, "Mahi", 75000, "HR");
        employees[1] = new Developer(2, "Anushka", 60000, "Java");

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}
