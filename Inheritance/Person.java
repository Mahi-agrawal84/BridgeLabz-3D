package Inheritance;
public class Person {
 protected String name;
 protected int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}
class Student extends Person {
 private int rollNumber;

 Student(String name, int age, int rollNumber) {
     super(name, age); 
     this.rollNumber = rollNumber;
 }

 @Override
 void displayInfo() {   
     super.displayInfo();
     System.out.println("Roll Number: " + rollNumber);
 }
}

class Teacher extends Person {
 private String subject;

 Teacher(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Subject: " + subject);
 }
}


