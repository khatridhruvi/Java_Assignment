/*pr_38 Write a Java program to create a new array list, add some colours (string)  
and print out the collection.*/

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class program_38 {
	public static void main(String[] args) {
		 List<String> list_color = new ArrayList<String>();
		  list_color.add("Red");
		  list_color.add("Green");
		  list_color.add("Orange");
		  list_color.add("White");
		  list_color.add("Black");
		  list_color.add("Blue");
		  list_color.add("Pink");
		  list_color.add("Yellow");
		  System.out.println(list_color);
	}
}
