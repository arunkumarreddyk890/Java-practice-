//finding HCF 
//HCF means highest common factor
//example taking numbers and finding common divisors or factor 
//12=1,2,3,4,6,12
//16=1,2,4,8,16
//the above factors there was 4 is common and highest factor so HCF is 4
//need to define the class
import java.util.*;
class Hcf{
public static void main(String args[])
{
//It is used to create the input on excuting process
Scanner sc=new Scanner(System.in);
System.out.print("enter first number:");
int hcf=0;
int x=sc.nextInt();
System.out.print("enter second number:");
int y=sc.nextInt();
//check the condition of I value is greater than values
for(int i=1;x>=i&&y>=i;i++){
if(x%i==0&&y%i==0)
{
hcf=i;
}
}
System.out.print("the HCF the "+x+"and"+y+" is:" +hcf);
}
}

