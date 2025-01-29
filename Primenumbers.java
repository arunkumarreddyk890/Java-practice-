//now the prime numbers between two numbers
import java.util.*;
class Primenumbers
{
public static void main(String args[])
{
//now implement the two numbers starting and ending
int start,end,i;
Scanner sc=new Scanner(System.in);
System.out.print("enter the starting number:");
start=sc.nextInt();
System.out.print("enter the ending number:");
end=sc.nextInt();
System.out.println("List of Prime number between "+start+" and "+end);
for(i=start;i<=end;i++)
{
if(thePrime(i))
{
System.out.print(" "+i);
}
}
}
public static boolean thePrime(int n)
{
if(n<=1)
{
 return false;
}
//in this we can take square root of the number
for(int i=2;i<=n-1;i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}
}
