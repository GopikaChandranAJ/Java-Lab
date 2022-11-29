import java.util.Scanner;
class Employee
{
 int EmpeNo,age,salary,i;
 long num;
 String name,address;
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the name");
  name=sc.next();
  System.out.println("Enter the age");
  age=sc.nextInt();
  System.out.println("Enter the contact");
  String str = sc.next();	
  num = Long.parseLong(str);
  System.out.println("Enter the address");
  address=sc.next();
  System.out.println("Enter the salary");
  salary=sc.nextInt();

 }
 void display()
 {
  System.out.println("Name: "+name);
  System.out.println("Age: "+age); 
  System.out.println("Contact: "+num);
  System.out.println("Address: "+address);
 }
 void print_salary()
 {
 System.out.println("Salary: "+salary);   
 }
}
class Officer extends Employee
{
  String sp;
 void specr()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the specialisation: ");
  sp=sc.next();
 }
 void specd()
 {
 System.out.println("Specialistaion: "+sp);
 }
}

class Manager extends Employee
{
 String de;
 void depr()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the department: ");
  de=sc.next();
 }
 void depd()
 {
 System.out.println("Department: "+de);
 }
}
 
class Offman
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Officer obj1=new Officer();
  obj1.read();
  obj1.specr();
  obj1.display();
  obj1.specd();
  obj1.print_salary();
  Manager obj2=new Manager();
  obj2.read();
  obj2.depr();
  obj2.display();
  obj2.depd();
  obj2.print_salary();
 } 
} 



































