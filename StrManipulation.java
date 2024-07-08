import java.util.Scanner;
public class StringManipulation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
int length = str.length();
System.out.println("Length: " + length);
String uppercase = str.toUpperCase();
System.out.println("Uppercase: " + uppercase);
String lowercase = str.toLowerCase();
System.out.println("Lowercase: " + lowercase);
System.out.print("Enter a character to replace: ");
char charToReplace = scanner.next().charAt(0);
System.out.print("Enter a replacement character: ");
char replacementChar = scanner.next().charAt(0);
String replaced = str.replace(charToReplace, replacementChar);
System.out.println("Replaced: " + replaced);
System.out.print("Enter the start index for substring: ");
int startIndex = scanner.nextInt();
System.out.print("Enter the end index for substring: ");
int endIndex = scanner.nextInt();
String substring = str.substring(startIndex, endIndex);
System.out.println("Substring: " + substring);
System.out.print("Enter a prefix to check: ");
String prefix = scanner.next();
boolean startsWith = str.startsWith(prefix);
System.out.println("Starts with '" + prefix + "': " + startsWith);
System.out.print("Enter a suffix to check: ");
String suffix = scanner.next();
boolean endsWith = str.endsWith(suffix);
System.out.println("Ends with '" + suffix + "': " + endsWith);
scanner.nextLine(); // Consume the newline left-over
System.out.print("Enter a string with leading and trailing spaces to trim: ");
String stringWithSpaces = scanner.nextLine();
String trimmed = stringWithSpaces.trim();
System.out.println("Trimmed: " + trimmed);
scanner.close();
}
}
