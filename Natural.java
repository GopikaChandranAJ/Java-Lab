import java.util.Scanner;
class Natural
{
 public static void main(String args[])
 {
  int i,n,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of terms:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  sum=sum+i;
  System.out.println("Sum is"+sum);
 }
}
