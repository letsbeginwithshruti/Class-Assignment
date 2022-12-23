/*Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)*/
// IT IS A MULTILEVEL INHERITANCE PROGRAM

 class Animal { // The base class
	void An()
	{
		System.out.println("Animal class");
	}
}
class Tree extends Animal 
{
	void Tr()
	{
		System.out.println("Tree Class");
	}
}
class Flower extends Tree 
{
	void fl()
	{
		System.out.println("Flower Class");
	}
}
public class multiInheritance { // main class
	public static void main(String args[])
	{
		Trees t=new Trees();
		Leaves l=new Leaves();
		Roots r=new Roots();
		t.An();
		l.Tr();
		r.fl();
	}
}
