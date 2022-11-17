import java.util.Scanner;
class Stringreplace
{
 public static void main(String args[])
 {
  int i;
  char e,f;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the String");
  String str=new String();
  str=sc.nextLine();
  String str1=new String();
  System.out.println("Enter the character to be replaced");
  e=sc.next().charAt(0);
  System.out.println("Enter the character");
  f=sc.next().charAt(0);
  for(i=0;i<str.length();i++)
  if(e!=str.charAt(i))
   str1+=str.charAt(i);
  else
   str1+=f;
  System.out.println("New string is "+str1);
       
 } 
}

