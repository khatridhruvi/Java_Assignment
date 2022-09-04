/*pr_43  Write a Java program to remove the third element from an array list.
*/

package Module_2;

import java.util.ArrayList;

public class program_43 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pink");
		list.add("White");
		list.add("Yellow");
		list.add("green");
		list.add("orange");
		
		System.out.println("Before removing array element");
		System.out.println("-----------------------------\n");
		System.out.println(list);
		
		list.remove(2);
		System.out.println("\nAfter removing array element");
		System.out.println("---------------------------\n");
		System.out.println(list);
 	}
}
