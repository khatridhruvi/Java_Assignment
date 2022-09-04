/*pr_57 Write a Java program to join two array lists.
*/

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class program_57 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		System.out.println("List of first array: " + list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("Orange");
		list2.add("yellow");
		list2.add("Blue");
		list2.add("Brown");
		System.out.println("List of second array: " + list2);

		List<String> list_new = new ArrayList<String>();
		list_new.addAll(list1);
		list_new.addAll(list2);
		System.out.println("\nNew array: " + list_new);
	}
}
