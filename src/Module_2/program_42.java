/*pr_42 Write a Java program to update specific array element by given element.*/

package Module_2;

import java.util.ArrayList;


public class program_42 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Green");
		names.add("Red");
		names.add("yellow");

		System.out.println("Before updating list is");
		System.out.println("-----------------------\n");
		System.out.println(names);

		names.set(1, "White");
		System.out.println("\n\nAfter updating list is");
		System.out.println("----------------------\n");

		System.out.println(names);
	}
}