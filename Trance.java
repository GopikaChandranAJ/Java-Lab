import java.util.Scanner;
class Transpose
{
 public static void main(String args[])
 {
  int i,j,sum=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of rows");
  int r=sc.nextInt();
  System.out.println("Enter the number of columns");
  int c=sc.nextInt();
 
  int a[][]=new int[r][c];
 
  System.out.println("Enter the elements");
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  a[i][j]=sc.nextInt();
  
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  if(i==j)
  sum=sum+a[i][j];
  System.out.println("sum is"+sum);
 }
}
