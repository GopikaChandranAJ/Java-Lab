import java.util.Scanner;
class Secondgreatest
{
 public static void main(String args[])
 {
  int t=0,i,n,large,s;
  System.out.println("Enter the size:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements");
  for(i=0;i<n;i++)
  a[i]=sc.nextInt();
  large=a[0];
  for(i=1;i<n;i++)
  if(large<a[i])
  {
  large=a[i];
  t=i;
  }
  System.out.println("largest is:"+large);
  a[t]=-1;
  s=a[0];
  for(i=1;i<n;i++)
  if(s<a[i])
  s=a[i];
  System.out.println("Second largest is:"+s);  
  
 }
}
  
  

