import java.util.Scanner;
interface Shape {
double area();
double perimeter();
}
class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
public double area() {
return Math.PI * radius * radius;
}
public double perimeter() {
return 2 * Math.PI * radius;
}
}
class Rectangle implements Shape {
private double length;
private double width;
public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
public double area() {
return length * width;
}
public double perimeter() {
return 2 * (length + width);
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("Choose shape:");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter radius of the circle: ");
double radius = scanner.nextDouble();
Circle circle = new Circle(radius);
System.out.println("Area of the circle: " + circle.area());
System.out.println("Perimeter of the circle: " + circle.perimeter());
break;
case 2:
System.out.print("Enter length of the rectangle: ");
double length = scanner.nextDouble();
System.out.print("Enter width of the rectangle: ");
double width = scanner.nextDouble();
Rectangle rectangle = new Rectangle(length, width);
System.out.println("Area of the rectangle: " + rectangle.area());
System.out.println("Perimeter of the rectangle: " + rectangle.perimeter());
break;
case 3:
System.out.println("Exiting...");
System.exit(0);
default:
System.out.println("Invalid choice!");
}
System.out.println();
}
}
}
