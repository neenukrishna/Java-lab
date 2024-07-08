import java.util.Scanner;
class Product {
 int pcode;
 String pname;
 double price;
 Product(int c, String n, double p) {
 pcode = c;
 pname = n;
 price = p;
 }
}
class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter details for Product 1:");
 System.out.print("Enter product code: ");
 int pcode1 = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Enter product name: ");
 String pname1 = scanner.nextLine();
 System.out.print("Enter product price: ");
 double price1 = scanner.nextDouble();
 System.out.println("Enter details for Product 2:");
 System.out.print("Enter product code: ");
 int pcode2 = scanner.nextInt();
 scanner.nextLine(); 
 System.out.print("Enter product name: ");
 String pname2 = scanner.nextLine();
 System.out.print("Enter product price: ");
 double price2 = scanner.nextDouble();
 System.out.println("Enter details for Product 3:");
 System.out.print("Enter product code: ");
 int pcode3 = scanner.nextInt();
 scanner.nextLine(); 
 System.out.print("Enter product name: ");
 String pname3 = scanner.nextLine();
 System.out.print("Enter product price: ");
 double price3 = scanner.nextDouble();
 Product product1 = new Product(pcode1, pname1, price1);
 Product product2 = new Product(pcode2, pname2, price2);
 Product product3 = new Product(pcode3, pname3, price3);
 Product lowestPriceProduct;
 if (product1.price < product2.price && product1.price < product3.price) {
 lowestPriceProduct = product1;
 } else if (product2.price < product1.price && product2.price < product3.price) {
 lowestPriceProduct = product2;
 } else {
 lowestPriceProduct = product3;
 }
 System.out.println("The lowest price product is: " + lowestPriceProduct.pname + " with price " + lowestPriceProduct.price);
 scanner.close();
 }
}
