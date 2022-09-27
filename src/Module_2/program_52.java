/*pr_52 Write a Java program to count the number of key-value (size) mappings 
in a map.
*/

package Module_2;

import java.util.HashMap;

import java.util.Map;

public class program_52 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "Grape");
		map.put(5, "Apple");

		System.out.println(map);
		System.out.println("Size of map is :-" + map.size());

	}
}