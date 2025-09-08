package AccessModifiers;
public class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi", 8.5);
        s1.displayDetails();
        s1.setCGPA(9.0);
        s1.displayDetails();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Anita", 9.2, "Computer Science");
        pg.displayPGDetails();
    }
}

