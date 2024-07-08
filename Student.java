import java.util.Scanner;
class Student
{
String name;
int score;
public Student(String name, int score)
{
this.name = name;
this.score = score;
}
}
class Sports extends Student
{
int Sscore;
public Sports(String name , int score,int Sscore)
{
super(name,score);
this.Sscore = Sscore;
}
}
class Result extends Sports
{
public Result(String name, int score, int Sscore)
{
super(name,score,Sscore);
}
public void display()
{
System.out.println("Student Name: " + name);
System.out.println("Academic Score: " + score);
System.out.println("Sports Score: " + Sscore);
}
}
public class Demo
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student Name: ");
String name = sc.nextLine();
System.out.print("Enter Academic Score: ");
int score = sc.nextInt();
System.out.print("Enter Sports Score: ");
int Sscore = sc.nextInt();
sc.close();
Result result = new Result(name,score,Sscore);
result.display();
}
}
