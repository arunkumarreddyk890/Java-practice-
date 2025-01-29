//finding factorial using Recursion method
import java.util.*;
class Facto
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int num=sc.nextInt();
int fact;
fact=facta(num);
System.out.println("the Factorial of "+num+" is "+fact);
}
static int facta(int n)
{
if(n<=1)
{
return 1;
}
else
{
n=n*facta(n-1);
return n;
}
}
}
