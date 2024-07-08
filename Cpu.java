import java.util.Scanner;
public class CPU {
 int price;
 class Processor {
 int cores;
 String producer;
 Processor(int noC, String manu) {
 cores = noC;
 producer = manu;
 }
 void display() {
 System.out.println("\nProcessor Info");
 System.out.println("No. of Cores = " + cores);
 System.out.println("Manufacturer = " + producer);
 }
 }
 static class RAM {
 int mem;
 String manuf;
 RAM(int memory, String producer) {
 mem = memory;
 manuf = producer;
 }
 void display() {
 System.out.println("\nRAM Info");
 System.out.println("Memory = " + mem + " GB");
 System.out.println("Manufacturer = " + manuf);
 }
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter RAM details:");
 System.out.print("Enter memory (in GB): ");
 int memory = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Enter manufacturer: ");
 String ramProducer = scanner.nextLine();
 CPU.RAM ram = new CPU.RAM(memory, ramProducer);
 System.out.println("Enter Processor details:");
 System.out.print("Enter number of cores: ");
 int cores = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Enter manufacturer: ");
 String processorProducer = scanner.nextLine();
 CPU cpu = new CPU();
 CPU.Processor processor = cpu.new Processor(cores, processorProducer);
 ram.display();
 processor.display();
 scanner.close();
 }
}
