import java.util.Scanner;
class Stringfrequency
{
 public static void main(String args[])
 {
  int i,count=0;
  char e;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the String");
  String str=new String();
  str=sc.nextLine();
  System.out.println("Enter the character");
  e=sc.next().charAt(0);
  for(i=0;i<str.length();i++)
  if(e==str.charAt(i))
  {
  count++;
  }
  System.out.println("Element occurs "+count+" times");
       
 } 
}

