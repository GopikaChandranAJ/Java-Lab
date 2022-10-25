import java.util.Scanner;
class Smallestarray
{
 public static void main(String args[])
 {
  int i,n,small;
  System.out.println("Enter the size:");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements");
  for(i=0;i<n;i++)
  a[i]=s.nextInt();
  small=a[0];
  for(i=1;i<n;i++)
  if(small>a[i])
  small=a[i];
  System.out.println("Smallest is"+small);
 }
}
  
  

