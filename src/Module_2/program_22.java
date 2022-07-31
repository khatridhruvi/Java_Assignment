/*pr_22 Create a class named 'Shape' with a method to print "This is this is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the 
Shape class, both having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 'Square' of 
'Rectangle' having a method to print "Square is a rectangle". Now call the 
method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/

package Module_2;

class Shape2{
	Shape2(){
		System.out.println("This is Shape.");
	}
}

class Rectangle1  extends Shape2{
	Rectangle1(){
		System.out.println("This is Rectangle.");
	}
}

class Square2 extends Rectangle1{
	Square2(){
		System.out.println("Square is a rectangle.");
	}
}

class Circle extends Shape2{
	Circle(){
		System.out.println("This is Circle.");
	}
}

public class program_22 {
	public static void main(String[] args) {
		Square2 s = new Square2();
	}
	
}
