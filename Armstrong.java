//WAP to check Armstrong number
import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
 int i,d,x,a=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
x=n;
while(i<=10)
{
d=n%10;//3, 5, 1
a=a+(d*d*d);
n=n/10;//15,value of n becomes 15, 1
}
if(a==x)
{
System.out.println("It is an Armstrong number");
}
 else
{
System.out.println("NOT an armstrongnumber");
}
}
}
