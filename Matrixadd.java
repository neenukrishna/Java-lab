import java.util.Scanner;
class MatrixAdd{
public static void main(String[] args){
int m,n,i,j;
int[][] a=new int[10][10];
int[][] b=new int[10][10];
int[][] c=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
m=sc.nextInt();
System.out.println("Enter the number of columns:");
n=sc.nextInt();
System.out.println("Enter the first matrix:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the second matrix:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
b[i][j]=sc.nextInt();
}
}
System.out.println("Matrix addition:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"\t");
}
System.out.println("\n");
}
}
}
