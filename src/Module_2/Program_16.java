/*pr_16 Create an abstract class 'Parent' with a method 'message'. It has two 
subclasses each having a method with the same name 'message' that 
prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.*/

package Module_2;

abstract class  Parents{
	abstract public void message();
}

class first extends Parents{

	@Override
	public void message() {
		System.out.println("This is first subclass.");
	}

}

class second extends Parents{

	@Override
	public void message() {
		System.out.println("This is second subclass.");
	}
	
}


public class Program_16 {
	public static void main(String[] args) {
		first f= new first();
		f.message();
		second s = new second();
		s.message();
	}
}
