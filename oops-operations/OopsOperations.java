/** 
 * 4 Major Concepts in OOPs
 * - Encapsulation
 * - Abstraction
 * - Inheritance
 * - Polymorphism
*/ 


// Encapsulation: Using private access modifiers and getters/setters
abstract class Person {
    private String name;
    private int age;

    // Constructor 
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void updateName(String name){
        this.name = name;
    }

    public void updateAge(int age){
        this.age = age;
    }

    // Abstraction: Abstract method
    abstract void displayDetails();
}

// Inheritance: Extending a class
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId){
        // Invoking the constructor of the superclass 
        super(name, age); 
        this.studentId = studentId;
    }

    public String getStudentId(){
        return this.studentId;
    }

    public void updateStudentId(String studentId){
        this.studentId = studentId;
    }

    // Polymorphism: Method Overriding & Implementation of the abstract method
    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
    }
}

// Inheritance: Extending a class
class Teacher extends Person {
    private String employeeId;

    public Teacher(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + employeeId);
    }
}

// Polymorphism: Method Overloading
class Common {
    // Method Overloading
    public int add(int a, int b){
        return a + b;
    }
    
    // Method Overloading
    public String add(String a, String b){
        return a + b;
    }
}


public class OopsOperations{
    public static void main(String args[]){
        System.out.println("##################################");
        System.out.println("----------Oops Operations---------");
        System.out.println("##################################");

        Common utils = new Common();
        Student student = new Student("Alice", 16, "S12345");
        Teacher teacher = new Teacher("Smith", 35, "T78901");

        student.updateName(utils.add("Alice", " Roy"));
        teacher.updateName(utils.add("Mr.", " Smith"));

        student.updateAge(utils.add(20, 4));

        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
    }
}