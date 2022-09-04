/*pr_41 Write a Java program to retrieve an element (at a specified index) from a 
given array list.*/

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class program_41 {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		  System.out.println(list);
		  String ele = list.get(0);
		  System.out.println("\n\n0 indext element is: "+ele);
		  ele = list.get(1);
		  System.out.println("1st index element is: "+ele);
		  ele = list.get(2);
		  System.out.println("2nd index element is: "+ele);
		  ele = list.get(3);
		  System.out.println("3rd index element is: "+ele);
		  ele = list.get(4);
		  System.out.println("4th index element is: "+ele);
	   }
	}

