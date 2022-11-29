class Exception
{
 public static void main(String args[])
 {
  int a[]={2,6};
  int b=6;
  try
  {
   int y = (a[0]/(b-a[1]));
  }
  catch(ArithmeticException e)
  {
   System.out.println("Division by zero is not possible");
  }
  try{
  int x = a[1]-a[2];
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Array index Error!");
  }
 }
}
