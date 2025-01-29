import java.util.*;
class Prime
{
public static void main(String args[])
{
//it is used to test given number is prime or not
Scanner sc=new Scanner(System.in);
int i,m,flag=0;
int n=sc.nextInt();
m=n-1;
if(n==0||n==1)
{
System.out.println("the given number is not prime number");
}
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.print("the number is not prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(n+"is prime number");
}
}
}

