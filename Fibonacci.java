//now the program is Fibonacci series
//Fibonacci means adding the previous two numbers
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//Now predenfinely start from 0 and 1 initial the 0 & 1
int n1=0;
int n2=1;
System.out.println(+n1);
System.out.println(+n2);
//now using for loop for the adding the numbers upto nth term
//start from i=2 because 1 is already printed
for(int i=1;i<=n;i++)
{
int n3=n1+n2;
n1=n2;
n2=n3;
if(n3==1)
{
System.out.println("");
}
else
{
System.out.println(+n3);
}
}
}
}

 