abstract class Shape
{
 abstract void numberofsides();
}
 class Rectangle extends Shape
 { 
  void numberofsides()
  {
   System.out.println("The number of sides of rectangle are 4");
  }
 }
 class Triangle extends Shape
 { 
  void numberofsides()
  {
   System.out.println("The number of sides of triangle are 3");
  }
 }
 class Hexagon extends Shape
 { 
  void numberofsides()
  {
   System.out.println("The number of sides of hexagon are 6");
  }
 }
 
class Abstractshape
{
 public static void main(String args[])
 {
  Shape s1=new Rectangle();
  s1.numberofsides();
  Shape s2=new Triangle();
  s2.numberofsides();
  Shape s3=new Hexagon();
  s3.numberofsides();
 }
}
