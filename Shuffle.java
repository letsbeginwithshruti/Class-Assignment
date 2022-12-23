package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle
	{
		public static void main(String[] args) {
			LinkedList<String> l1= new LinkedList<String>(); //creating list 
			l1.add("Cat");
			l1.add("Horse");
			l1.add("Lion");
			l1.add("Dog");
			l1.add("Monkey");
			System.out.println("List elements : "+l1); //prints list elements
			Collections.shuffle(l1);  //method to shuffle
			System.out.println("After shuffling : "+l1); //After shuffle the list elements
			}
			
	}
