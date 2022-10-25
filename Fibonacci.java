import java.util.Scanner;
class Fibonacci
 {
  public static void main(String args[])
  {
   int a=0,b=1,n,t=a+b,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of terms");
   n=sc.nextInt();
   System.out.println("The series are");
   System.out.print("0 1");
   for(i=3;i<=n;i++)
   {
    System.out.print(" "+t);
    a=b;
    b=t;
    t=a+b;
   }
   System.out.println("\n");
  }
 }

