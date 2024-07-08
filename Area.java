import java.util.Scanner;
class Over {
float pi = 3.14f;
int length, breadth, r;
void area(int r) {
System.out.println("Area of circle: " + (pi * r * r));
}
void area(int length, int breadth) {
System.out.println("Area of rectangle: " + (length * breadth));
}
}
class Overloading {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
Over O = new Over();
System.out.print("Enter the radius of the circle: ");
int radius = scanner.nextInt();
O.area(radius);
System.out.print("Enter the length of the rectangle: ");
int length = scanner.nextInt();
System.out.print("Enter the breadth of the rectangle: ");
int breadth = scanner.nextInt();
O.area(length, breadth);
scanner.close();
}
}
