import java.io.*;
import java.lang.*;
import java.util.Scanner;
class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char x=s.next().charAt(0);
if((x>='a' && x<='z') || (x>='A' && x<='Z'))
{
System.out.println("Alphabet");
}
else
{
System.out.println("NO");
}
}
}



