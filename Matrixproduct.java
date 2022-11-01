import java.util.Scanner;
class Matrixproduct
{
 public static void main(String args[])
 {
  int i,j,k;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of rows of a");
  int r1=sc.nextInt();
  System.out.println("Enter the number of columns of a");
  int c1=sc.nextInt();
  
  System.out.println("Enter the number of rows of b");
  int r2=sc.nextInt();
  System.out.println("Enter the number of columns of b");
  int c2=sc.nextInt();
  
  int a[][]=new int[r1][c1];
  int b[][]=new int[r2][c2];
  int p[][]=new int[r1][c2];
  System.out.println("Enter the elements of a");
  for(i=0;i<r1;i++)
  for(j=0;j<c1;j++)
  a[i][j]=sc.nextInt();
  System.out.println("Enter the elements of b");
  for(i=0;i<r2;i++)
  for(j=0;j<c2;j++)
  b[i][j]=sc.nextInt();
  
  for(i=0;i<r1;i++)
  for(j=0;j<c2;j++)
  for(k=0;k<c1;k++)
  p[i][j]+=a[i][k]*b[k][j];
  System.out.println("Product is");
  for(i=0;i<r1;i++)
  for(j=0;j<c2;j++)
  System.out.println(p[i][j]);
 }
}
