import java.util.Scanner;
class Student
{
 int Rollno,i;
 String name;
 int mark[]=new int[5];
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the rollno");
  Rollno=sc.nextInt();
  System.out.println("Enter the name");
  name=sc.next();
  System.out.println("Enter the marks");
  for(i=0;i<5;i++)
  mark[i]=sc.nextInt();
 }
 void display()
 {
  System.out.println("Rollno "+Rollno);
  System.out.println("Name: "+name);
  for(i=0;i<5;i++)
  System.out.println("Marks are "+mark[i]); 
 }  
 }
  
class Studentclass
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of students: ");
  int n=sc.nextInt();
  Student stlist[]=new Student[n];
  for(int i=0;i<n;i++)
  {
  System.out.println("Enter the details of students: ");
  stlist[i]=new Student();
  stlist[i].read();
  }
  for(int i=0;i<n;i++)
  {
  System.out.println("The details of students are: ");
  stlist[i].display();
  }
 } 
} 















