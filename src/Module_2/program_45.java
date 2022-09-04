/*pr_45 Write a Java program to sort a given array list.*/

package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class program_45 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(45);
		list.add(22);
		list.add(67);
		list.add(1);
		
		 System.out.println("The list is defined as: "+list);
		 
		Collections.sort(list);
		
		System.out.println("\nThe sorted list is: " +list);
	}
}
