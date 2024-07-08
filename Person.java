import java.util.Scanner;
class Person {
String name;
String gender;
String address;
int age;
Person(String name, String gender, String address, int age) {
this.name = name;
this.gender = gender;
this.address = address;
this.age = age;
}
}
class Employee extends Person {
int empid;
String companyName;
String qualification;
double salary;
Employee(String name, String gender, String address, int age, int empid, String
companyName, String qualification, double salary) {
super(name, gender, address, age);
this.empid = empid;
this.companyName = companyName;
this.qualification = qualification;
this.salary = salary;
}
}
class Teacher extends Employee {
String subject;
String department;
int teacherId;
Teacher(String name, String gender, String address, int age, int empid, String
companyName, String qualification, double salary, String subject, String department, int
teacherId) {
super(name, gender, address, age, empid, companyName, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherId = teacherId;
}
public void display() {
System.out.println("Teacher ID: " + teacherId);
System.out.println("Name: " + name);
System.out.println("Gender: " + gender);
System.out.println("Address: " + address);
System.out.println("Age: " + age);
System.out.println("Employee ID: " + empid);
System.out.println("Company Name: " + companyName);
System.out.println("Qualification: " + qualification);
System.out.println("Salary: " + salary);
System.out.println("Subject: " + subject);
System.out.println("Department: " + department);
}
}
class EmployeeMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of teachers: ");
int n = sc.nextInt();
Teacher[] teachers = new Teacher[n];
for (int i = 0; i < n; i++) {
System.out.println("Enter details for teacher " + (i + 1) + ":");
System.out.print("Name: ");
String name = sc.next();
System.out.print("Gender: ");
String gender = sc.next();
System.out.print("Address: ");
String address = sc.next();
System.out.print("Age: ");
int age = sc.nextInt();
System.out.print("Employee ID: ");
int empid = sc.nextInt();
System.out.print("Company Name: ");
String companyName = sc.next();
System.out.print("Qualification: ");
String qualification = sc.next();
System.out.print("Salary: ");
double salary = sc.nextDouble();
System.out.print("Subject: ");
String subject = sc.next();
System.out.print("Department: ");
String department = sc.next();
System.out.print("Teacher ID: ");
int teacherId = sc.nextInt();
teachers[i] = new Teacher(name, gender, address, age, empid, companyName,
qualification, salary, subject, department, teacherId);
}
System.out.println("\n--- Details of Teachers ---");
for (int i = 0; i < teachers.length; i++) {
teachers[i].display();
System.out.println();
}
}
}
