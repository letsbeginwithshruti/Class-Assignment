package pack.com;

import java.util.Scanner;

public class Sum
{
	public static void main(String args[])
	{
		int n,i,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entetr the number:- ");
		n=sc.nextInt();
		for(i=1;i<=n;i+=2)
		{
			s+=n;
		}
		System.out.println("Sum of ODD numbers are:- "+s);
	}
}
