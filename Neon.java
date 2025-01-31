//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
//for example take an integer 9, the square of 9 is 81,the 8+1=9. hence the 9 is neon number
//take as take 45 ,the square of 45 is 2025,2+0+2+5=9,hence the 45 is not neon number
import java.util.*;
class Neon
{
public static void main(String args[])
{
int sum=0,n,digits,sq;
Scanner sc=new Scanner(System.in);
System.out.print("Enetr an interger number to check the give number is neon are not:");
n=sc.nextInt();
sq=n*n;
for( ;sq!=0;sq=sq/10)
{
digits=sq%10;
sum=sum+digits;
}
if(sum==n)
{
System.out.println("The given number "+n+" is neon number");
}
else
{
System.out.println("The given number "+n+" is not neon number");
}
}
}
