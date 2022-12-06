import java.io.*;
class A implements Runnable
{
 public void run()
 {
  System.out.println("Even numbers are: ");
  for(int i=0;i<=100;i++)
  {
  if(i%2==0)
  System.out.print(" "+i);
  }
  System.out.println("\nExit from A");
 }
}

class B implements Runnable
{
 public void run()
 {
 System.out.println("Odd numbers are: ");
 for(int j=0;j<=100;j++)
  {
  if(j%2!=0)
  System.out.print(" "+j);
  }
  System.out.println("\nExit from B");
 }
}
 
class Multithread
{
 public static void main(String args[]) throws InterruptedException
 {
 A obj1=new A();
 B obj2=new B();
 Thread t1=new Thread(obj1);
 Thread t2=new Thread(obj2);
 t1.start();
 t1.join();
 t2.start();
 }
}

