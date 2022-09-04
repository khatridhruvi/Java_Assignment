/*pr_49 Write a Java program to iterate through all elements in a hash list*/

package Module_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class program_49 {
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
		
		Iterator itr = set.iterator();
		System.out.println("\nIterate elements :");
		System.out.println("------------------\n");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
