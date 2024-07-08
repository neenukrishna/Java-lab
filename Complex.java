import java.util.Scanner;
public class ComplexNumber {
 int r;
 int i;
 ComplexNumber(int real, int img) {
 r = real;
 i = img;
 }
 void display() {
 System.out.println(r + "+" + i + "i");
 }
 static void add(int r1, int i1, int r2, int i2) {
 r1 = r1 + r2;
 i1 = i1 + i2;
 System.out.println("After Addition = " + r1 + "+" + i1 + "i");
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter details for the first complex number:");
 System.out.print("Enter real part: ");
 int real1 = scanner.nextInt();
 System.out.print("Enter imaginary part: ");
 int img1 = scanner.nextInt();
 System.out.println("Enter details for the second complex number:");
 System.out.print("Enter real part: ");
 int real2 = scanner.nextInt();
 System.out.print("Enter imaginary part: ");
 int img2 = scanner.nextInt();
 ComplexNumber first = new ComplexNumber(real1, img1);
 ComplexNumber second = new ComplexNumber(real2, img2);
 System.out.println("Complex Numbers are:");
 first.display();
 second.display();
 add(first.r, first.i, second.r, second.i);
 scanner.close();
 }
}
