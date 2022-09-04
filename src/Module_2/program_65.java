/*pr_65 Write a Java program to get a collection view of the values contained in 
this map.*/

package Module_2;

import java.util.HashMap;
import java.util.Map;

public class program_65 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");

		System.out.println("Collection view is: " + map.values());
	}
}
