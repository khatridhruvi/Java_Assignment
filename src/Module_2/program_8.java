/*pr_8 Create a class named 'PrintNumber' to print various numbers of different 
data types by creating different methods with the same name 'printn' 
having a parameter for each data type.*/

package Module_2;

class PrintNumber{
	public void printn(int i) {
		System.out.println("Number is :-"+i);
	}
	
	public void printn(float i) {
		System.out.println("Number is :-"+i);
	}
		
	public void printn(double i) {
		System.out.println("Number is:-"+i);
	}
}
public class program_8 {
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		pn.printn(10);
		pn.printn(10.234f);
		pn.printn(45.987654);
	}
}
