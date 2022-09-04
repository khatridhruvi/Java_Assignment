/*pr_46 Write a Java program to copy one array list into another.*/

package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class program_46 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("List: " + list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		System.out.println("List: " + list1);
		
		Collections.copy(list, list1);
		
		System.out.println("\nAfter copy");
		  System.out.println("\nList1: " + list);
		  System.out.println("List2: " + list1);
	}
}
