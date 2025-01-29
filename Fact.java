//Factorial using for loop
import java.util.*;
class Fact
{
public static void main(String args[])
{
int i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("The factorial of " +num+ " is " +fact);
}
}


