import java.util.Scanner;
class Shape
{
 void area(int x,int y)
 {
  System.out.println("Area is of rectangle is:"+(x*y));
 }
 void area(float r)
 {
  System.out.println("Area of circle is:"+(3.14*r*r));
 }
}

class Area
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
   Shape obj=new Shape();
   obj.area(x,y);
   obj.area(r);
 }
}
    
  

