/*pr_47 Write a Java program to shuffle elements in an array list.*/

package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class program_47 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("E");
	      list.add("F");
	      System.out.println("Original list : " + list);
	      Collections.shuffle(list); 
	      System.out.println("Shuffled list : " + list);
	}
}
