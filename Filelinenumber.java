import java.io.*;
class Filelinenumber
{
 public static void main(String args[]) throws IOException
 { 
  FileInputStream F=new FileInputStream("MyFile.txt");
  int i=1,ch;
   System.out.print(i+":");
   while((ch=F.read())!=-1)
   {
    System.out.print((char)ch);
     if(ch=='\n'&& F.available()!=0)
     {
      System.out.print("\n"+ ++i+ ":");
     }
   }
   F.close();
 }
}
