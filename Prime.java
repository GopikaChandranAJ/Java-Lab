import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int i,n,flag=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
  n=s.nextInt();
  for(i=2;i<=n/2;i++)
  if(n%i==0)
  {
  flag=1;
  break;
  }
  if(n==0||n==1||flag==1)
  System.out.println("Number is not prime");
  else
  System.out.println("Number is prime");
 }
}
