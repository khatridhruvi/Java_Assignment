package Module_2;

abstract class Shape{
	abstract public void RectangleArea(float length,float breadth);
	abstract public void SquareArea(float side);
	abstract public void CircleArea(float radius);
}

class area2 extends Shape{
	
	@Override
	public void RectangleArea(float length, float breadth) {
		
		System.out.println("The area of rectangle is :-"+(length*breadth));
	}

	@Override
	public void SquareArea(float side) {
		
		System.out.println("The area of Square is :-"+( side*side));
	}

	@Override
	public void CircleArea(float radius) {
		
		System.out.println("The area of Circle is :-"+(float) (3.14*(radius*radius)));	
	}
}

public class Program_20 {
	public static void main(String[] args) {
		area2 a = new area2();
		a.RectangleArea(56, 12);
		a.SquareArea(45);
		a.CircleArea(12);	
	}
}
