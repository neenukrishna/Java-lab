import java.util.Scanner;
interface calc {
void calculate();
}
class Bill implements calc {
String date, name, p_id;
int quantity;
double unit_price, total;
static double namount = 0;
Scanner sc = new Scanner(System.in);
public void getdata() {
System.out.println("\nEnter product id:");
p_id = sc.nextLine();
System.out.println("Enter product name:");
name = sc.nextLine();
System.out.println("Enter the Quantity:");
quantity = Integer.parseInt(sc.nextLine()); // Read quantity as String and then parse to
int
System.out.println("Enter the unit price:");
unit_price = Double.parseDouble(sc.nextLine()); // Read unit_price as String and then
parse to double
}
@Override
public void calculate() {
total = quantity * unit_price;
}
public void display() {
System.out.println(p_id + "\t\t" + name + "\t\t" + quantity + "\t\t" + unit_price + "\t" +
total);
}
}
public class Amount {
public static void main(String[] args) {
int n, i;
double namount = 0, t;
int ran;
String date;
t = Math.random() * 1000000;
ran = (int) t;
Scanner sc = new Scanner(System.in);
System.out.println("Order no. #" + ran);
System.out.println("Enter the date:");
date = sc.nextLine();
System.out.println("Enter how many products are there:");
n = sc.nextInt();
sc.nextLine(); // Consume the leftover newline
Bill[] ob = new Bill[n];
for (i = 0; i < n; i++) {
ob[i] = new Bill();
}
for (i = 0; i < n; i++) {
ob[i].getdata();
ob[i].calculate();
}
System.out.println("Date:" + date);
System.out.println("Product Id \t Name\t Quantity\t unit price\t Total ");
System.out.println("--------------------------------------------------------------");
for (i = 0; i < n; i++) {
ob[i].display();
namount += ob[i].total;
}
System.out.println("--------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t\tNet.Amount\t" + namount);
sc.close();
}
}
