import java.util.Scanner;
class Perim
{
 Perim(int x,int y)
 {
  System.out.println("Perimeter of rectangle is:"+(2*(x+y)));
 }
  Perim(float r)
 {
  System.out.println("Perimeter of circle is:"+(2*3.14*r));
 }
}

class Perimeter
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the length:");
   int x=sc.nextInt();
   System.out.println("Enter the breadth:"); 
   int y=sc.nextInt();
   System.out.println("Enter the radius:");
   float r=sc.nextFloat();
   Perim obj1=new Perim(x,y);
   Perim obj2=new Perim(r);
 }
}
    
  

