/*pr_53 Write a Java program to reverse elements in an array list. */

package Module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program_53 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println("List before reversing :\n" + list);
		Collections.reverse(list);
		System.out.println("\nList after reversing :\n" + list);
	}
}