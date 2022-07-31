/*pr_13 Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the 
rectangle respectively. Its constructor having parameters for length and 
breadth is used to initialize the length and breadth of the rectangle. Let 
class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class 
as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

package Module_2;

class Rectangle{
	int length ,breadth;
	
	public Rectangle(int l ,int b) {
		this.length=l;
		this.breadth=b;
	}
	
	public void area() {
		System.out.println("Area of Rectangle is :-"+(length*breadth));
	}	
	
	public void perimeter() {
		System.out.println("Perimeter of Rectangle is :-"+(2*(length+breadth)));
	}
}	

class Square extends Rectangle{
	public Square(int s){
		super(s,s);
	}
}

public class program_13 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(12,10);
		r.area();
		r.perimeter();
		Square s= new Square(5);
		s.area();
		s.perimeter();
	}
}
