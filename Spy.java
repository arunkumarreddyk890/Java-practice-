//Spy number means the sum of the digits of given number is equal to product of the digits of given number
//example the number is 123 the sum of the number is 6
//product of the digits of number is 6
//sum=product
import java.util.*;
class Spy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
int number=num;
System.out.println("The given number is:"+num);
int product=1,sum=0;
for( ;num>0;num=num/10)
{
int lastdigit=num%10;
sum=sum+lastdigit;
product=product*lastdigit;
}
System.out.println("The sum of digits of given number is:"+sum);
System.out.println("The product of digits of given number is:"+product);
if(sum==product)
{
System.out.println("The sum & product is equal so given number "+number+" is spy number");
}
else
{
System.out.println("The sum & product is not equal so given number "+num+" is not spy number");
}
}
}