import java.util.Scanner;
class Publisher {
protected String name;
public Publisher(String name) {
this.name = name;
}
public String getName() {
return name;
}
}
class Book extends Publisher {
protected String title;
protected String author;
protected int year;
public Book(String title, String author, int year, String publisher) {
super(publisher);
this.title = title;
this.author = author;
this.year = year;
}
public void displayDetails() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
System.out.println("Publisher: " + getName());
}
}
class Literature extends Book {
public Literature(String title, String author, int year, String publisher) {
super(title, author, year, publisher);
}
}
class Fiction extends Book {
public Fiction(String title, String author, int year, String publisher) {
super(title, author, year, publisher);
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter book category (Literature/Fiction): ");
String category = scanner.nextLine();
System.out.print("Enter title: ");
String title = scanner.nextLine();
System.out.print("Enter author: ");
String author = scanner.nextLine();
System.out.print("Enter year: ");
int year = scanner.nextInt();
scanner.nextLine(); // Consume the leftover newline
System.out.print("Enter publisher: ");
String publisher = scanner.nextLine();
if (category.equalsIgnoreCase("Literature")) {
Literature book = new Literature(title, author, year, publisher);
System.out.println("\nDetails of Literature Book:");
book.displayDetails();
} else if (category.equalsIgnoreCase("Fiction")) {
Fiction book = new Fiction(title, author, year, publisher);
System.out.println("\nDetails of Fiction Book:");
book.displayDetails();
} else {
System.out.println("Invalid category");
}
scanner.close();
}
}
