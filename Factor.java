import java.util.Scanner;
class Factor
{
 public static void main(String args[])
 {
  int num,i;
  System.out.println("Enter the number");
  Scanner s=new Scanner(System.in);
  num=s.nextInt();
  System.out.println("The factors are:");
  for(i=1;i<=num;i++)
  {
   if(num%i==0)
   System.out.println(" "+i);
  }
 }
}
