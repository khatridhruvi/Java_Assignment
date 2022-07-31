/*pr_4 W.A.J.P to check whether a given string ends with the contents of another 
string. "Java Exercises" ends with "se"? False "Java Exercise" ends with 
"se"? True*/

package Module_2;

public class program_4 {
	public static void main(String[] args) {
		String str = "Java Exercises";
		String str1 = "Java Exercise";
		
		System.out.println("Ends with \"se\" :-"+ str.endsWith("se"));
		System.out.println("Ends with \"se\" :-"+ str1.endsWith("se"));
	}
}
