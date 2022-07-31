/*pr_5 W.A.J.P to check whether a given string starts with the contents of 
another string. Red is favourite color. Starts with Red? True Orange is also 
my favorite color. Starts with Red? False */

package Module_2;

public class program_5 {
	public static void main(String[] args) {
		String str="Red is favourite color";
		String str1="Orange is also my favorite color";
		
		System.out.println("String start with \"Red\":-"+str.startsWith("Red"));
		System.out.println("String start with \"Red\":-"+str1.startsWith("Red"));
		
	}
}
