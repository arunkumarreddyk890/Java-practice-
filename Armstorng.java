//Amstrong number means the power of the given number with how many digits in the number
//example : 153=1^3+5^3+3^3
import java.util.*;
import java.lang.Math;
class Armstorng
{
static boolean isAmstrong(int n)
{
int digits=0,sum=0,temp,lastdigit=0;
temp=n;
while(temp>0)
{
temp=temp/10;
digits++;
}
temp=n;
while(temp>0)
{
lastdigit=temp%10;
sum +=(Math.pow(lastdigit,digits));
temp=temp/10;
}
if(n==sum)
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter an number:");
int num=sc.nextInt();
if(isAmstrong(num))
{
System.out.println("The given number "+num+" is Amstrong number");
}
else
{
System.out.println("The given number "+num+" is not Amstrong number");
}
}
}
