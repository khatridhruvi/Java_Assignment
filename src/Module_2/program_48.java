/*pr_48 Write a Java program to append the specified element to the end of a 
hash set. */

package Module_2;

import java.util.HashSet;
import java.util.Set;

public class program_48 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Pink");
		set.add("Yellow");
		set.add("Blue");
		set.add("Green");
		set.add("White");
		set.add("Black");
		System.out.println("The Hash Set: "+set);
	}
}
