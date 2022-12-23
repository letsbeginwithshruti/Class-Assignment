/*Q.3   we need to print the elements of the array which 
      are present in odd positions.*/

package pack.com;

public class Odd
{
	public static void main(String args[]) 
	{
		int n[]= {11,21,22,33,10,9,15}; 
		for(int i=0;i<n.length;i+=2) 
		System.out.print(n[i]); 
	}
}
