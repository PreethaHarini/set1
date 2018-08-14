import java.io.*;
import java.lang.*;
import java.util.Scanner;
class calc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a==0)
{
System.out.println("Zero");
}
else if(a>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Negative");
}
}
}
