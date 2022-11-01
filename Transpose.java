import java.util.Scanner;
class Transpose
{
 public static void main(String args[])
 {
  int i,j;
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
  System.out.println("Transpose is");
  for(i=0;i<c;i++)
  for(j=0;j<r;j++)
  System.out.println(a[j][i]);
 }
}

