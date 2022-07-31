/*pr_9  Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters. For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n).*/

package Module_2;

class print{
	
	public void output(int n , char c) {
		System.out.println("Integer is :-"+n);
		System.out.println("Character is :-"+c);
	}
	
	public void output(char c , int n) {
		System.out.println("\ncharacter is :-"+c);
		System.out.println("Integer is :-"+n);
	}
}
public class program_9 {
	public static void main(String[] args) {
		print p = new print();
		p.output(10, 'A');
		p.output('B', 20);
	}
}
