import java.util.Scanner;
class Sumarray
{
 public static void main(String args[])
 {
  int i,n,sum=0;
  System.out.println("Enter the size:");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements");
  for(i=0;i<n;i++)
  a[i]=s.nextInt();
  for(i=0;i<n;i++)
  sum=sum+a[i];
  System.out.println("Sum is"+sum);
 }
}
  
  

