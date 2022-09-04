/*pr_62 Write a Java program to replace the second element of an ArrayList with 
the specified element. */

package Module_2;

import java.util.ArrayList;

public class program_62 {
	public static void main(String[] args) {
		  ArrayList<String>  color = new ArrayList<String>();

		  color.add("Red");
		  color.add("Green");

		  System.out.println("Original array list: " + color);
		  String new_color = "White";
		  color.set(1,new_color);
		  
		  System.out.println("New array list is: "+color);
	}
}
