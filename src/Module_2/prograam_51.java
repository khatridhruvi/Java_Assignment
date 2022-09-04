/*pr_51 Write a Java program to associate the specified value with the specified 
key in a HashMap. */

package Module_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class prograam_51 {
	public static void main(String[] args) {
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Mango");
		map.put(2, "Banana");
		map.put(3,"Orange");
		map.put(4, "Grape");
		map.put(5, "Apple");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();

System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
