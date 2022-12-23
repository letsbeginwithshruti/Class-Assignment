/*Q.1   Write a Java program to test if an array contains 
      a specific value.*/

package pack.com;

import java.util.Scanner;

public class FindValue {
	public static void main(String args[]) 
  {
		int n,i;
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers: "); 
			a[i]=sc.nextInt();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find: "); 
		n=sc.nextInt();
		for(i=0;i<10;i++)
		if(n==a[i]) {
			System.out.println(n+" Found at Position: "+(i+1)); 
		}
	}
}
