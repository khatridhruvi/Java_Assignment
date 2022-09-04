/*pr_59 Write a Java program to convert a hash set to a List/ArrayList.*/

package Module_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class program_59 {
	public static void main(String[] args) {
		   HashSet<String> set = new HashSet<String>();
		  
		          set.add("Red");
		          set.add("Green");
		          set.add("Black");
		          set.add("White");
		          set.add("Pink");
		          set.add("Yellow");
		      System.out.println("Original Hash Set: " + set);
		    
		     List<String> list = new ArrayList<String>(set);
		     System.out.println("ArrayList contains: "+ list);
	}
}
