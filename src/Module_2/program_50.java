/*pr_50  Write a Java program to get the number of elements in a hash set.
*/

package Module_2;

import java.util.HashSet;
import java.util.Set;

public class program_50 {
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
		System.out.println("Size of hase set is:- "+set.size());
	}
}
