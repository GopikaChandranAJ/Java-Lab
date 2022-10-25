import java.util.Scanner;
class Replace
{
 public static void main(String args[])
 {
  int j,i,n,k;
  System.out.println("Enter the size:");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements");
  for(i=0;i<n;i++)
  a[i]=s.nextInt();
  System.out.println("Enter the element to be replaced:");
  k=s.nextInt();
  System.out.println("Enter the position to be replaced:");
  j=s.nextInt();
  a[j]=k;
  System.out.println("Array is:");
  for(i=0;i<n;i++)
  System.out.print(" "+a[i]);
  System.out.print("\n");
  
 }
}
  
  

