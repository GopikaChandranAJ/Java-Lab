import java.util.Scanner;
class Stringpalindrome
{
 public static void main(String args[])
 {
  int j,i,flag=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the String");
  String str=new String();
  str=sc.nextLine();
 
 for(i=0,j=str.length()-1;i<str.length() && j>=0;i++,j--)
  {
  if(str.charAt(i)==str.charAt(j))
     flag=1;
     break;
  }
  if(flag==1)
  System.out.println("Is a palindrome");
  else
  System.out.println("not a palindrome");
     
 } 
}

