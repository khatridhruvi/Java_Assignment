/*pr_56 Write a Java program of swap two elements in an array list.*/

package Module_2;

import java.util.ArrayList;

import java.util.Collections;

public class program_56 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pink");
		list.add("White");
		list.add("Yellow");
		list.add("green");
		list.add("orange");

		System.out.println("Before swapping list is:");
		System.out.println("-----------------------");
		System.out.println(list);

		Collections.swap(list, 2, 3);

		System.out.println("\n\nAfter Swapping list is:");
		System.out.println("-----------------------");
		System.out.println(list);
	}
}
