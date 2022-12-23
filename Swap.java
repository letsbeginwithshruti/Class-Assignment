package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Swap
{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>(); //creating list 
		l1.add("Rose");
		l1.add("Lotus");
		l1.add("Tulip");
		l1.add("Hibiscus");
		l1.add("Daffodil");
		System.out.println("List elements : "+l1);
		Collections.swap(l1, 1,3); 
		System.out.println("After swapping the updated list is : "+l1); //After swapping result
	}
}
