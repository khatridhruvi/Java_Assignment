/*pr_55 Write a Java program to compare two array lists.*/

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class program_55 {
	public static void main(String[] args) {
		 List<String> list_color = new ArrayList<String>();
		  list_color.add("Red");
		  list_color.add("Green");
		  list_color.add("Orange");
		  list_color.add("White");
		  list_color.add("Black");
		  
		  System.out.println(list_color);
		  
		  List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		  System.out.println(list);
		  
	}
}