import java.util.Scanner;
class Empe
{
 int EmpeNo,i;
 long num;
 String name;
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the empno");
  EmpeNo=sc.nextInt();
  System.out.println("Enter the name");
  name=sc.next();
  System.out.println("Enter the contact");
  String str = sc.next();	
  num = Long.parseLong(str);
 }
 void display()
 {
  System.out.println("empno: "+EmpeNo);
  System.out.println("Name: "+name);
  System.out.println("Number: "+num); 
 }  
}
  
class Employee
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of employees: ");
  int n=sc.nextInt();
  Empe emplist[]=new Empe[n];
  for(int i=0;i<n;i++)
  {
  System.out.println("Enter the details of employee: ");
  emplist[i]=new Empe();
  emplist[i].read();

  }
  for(int i=0;i<n;i++)
  {
  System.out.println("The details of employee are: ");
  emplist[i].display();
  }
 } 
} 



































