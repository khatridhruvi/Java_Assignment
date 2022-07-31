/*pr_10 Create a class to print the area of a square and a rectangle. The class has  
two methods with the same name but different number of parameters. 
The method for printing area of a rectangle has two parameters which are 
length and breadth respectively while the other method for printing area 
of square has one parameter which is side of square.
*/

package Module_2;

class Area{
	
	public void find(int L , int B) {
		System.out.println("The area of rectangle is :-"+(L*B));
	}
	
	public void find(int S) {
		System.out.println("The area of square is :-"+(S*S));
	}
}


public class Program_10 {
	public static void main(String[] args) {
		Area a = new Area();
		a.find(10, 60);
		a.find(14);
	}
	
}
