import java.util.*;
class Atm
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int balance=10000,withdraw,deposit;
while(true)
{
System.out.println("choose 1 for withdraw money");
System.out.println("choose 2 for deposit money");
System.out.println("choose 3 for check balance");
System.out.println("choose 4 for exit");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.print("enter withdraw amount:");
withdraw=sc.nextInt();
if(balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("Take the withdraw money"+withdraw);
System.out.println("Available balance is:"+balance);
}
else
{
System.out.println("influence of found check the withdraw Amount");
System.out.println("The available balance is:"+balance);
}
System.out.println("");
break;
case 2:
System.out.print("Enter amount how munch of money deposited in your account:");
deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("The total availablle amount is:"+balance);
break;
case 3:
System.out.println("The Available Balance is:"+balance);
break;
case 4:
System.exit(0);
}
}
}
}

