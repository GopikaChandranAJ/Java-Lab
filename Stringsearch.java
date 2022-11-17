import java.util.Scanner;
class Stringsearch
{
 public static void main(String args[])
 {
  int flag=0,i;
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
  flag=1;
  break;
  }
  if(flag==1)
  System.out.println(i+1);
  else
  System.out.println("not present");
     
 } 
}

