package Inheritance;
public class MainPerson {
public static void main(String[] args) {
   Student s = new Student("Mahi", 20, 101);
   Teacher t = new Teacher("Anushka", 45, "Mathematics");

   System.out.println("Student Info");
   s.displayInfo();

   System.out.println("\nTeacher Info");
   t.displayInfo();
}
}
