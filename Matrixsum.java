import java.util.Scanner;
class Matrixsum
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
  int b[][]=new int[r][c];
  int s[][]=new int[r][c];
  System.out.println("Enter the elements of a");
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  a[i][j]=sc.nextInt();
  System.out.println("Enter the elements of b");
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  b[i][j]=sc.nextInt();
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  s[i][j]=a[i][j]+b[i][j];
  System.out.println("Sum is");
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  System.out.println(s[i][j]);
 }
}
