/*pr_39 Write a Java program to iterate through all elements in an array list.*/

package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class program_39 {
	public static void main(String[] args) {
		ArrayList List = new ArrayList();
	      List.add("100");
	      List.add("200");
	      List.add("300");
	      List.add("400");
	      List.add("500");
	      List.add("600");
	      List.add("700");
	      List.add("800");
	      List.add("900");
	      List.add("1000");
	      
	      System.out.println("ArrayList is ........\n");
	      System.out.println(List);
	      
	      Iterator itr = List.iterator();
	      
	      System.out.println("\nIteration is....");
			while(itr.hasNext()) {
				
				System.out.println("\n"+itr.next());
			}
	}
}
