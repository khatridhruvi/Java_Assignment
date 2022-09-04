/*pr_58 Write a Java program to convert a hash set to an array.*/

package Module_2;

import java.util.HashSet;

public class program_58 {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("13");
	        set.add("27");
	        set.add("87");
	        set.add("19");
	  
	        System.out.println("Hash Set Contains :" + set);
	        String arr[] = new String[set.size()];
	          
	        int i=0;
	        
	        for(String ele:set){
	          arr[i++] = ele;
	        }
	  
	        for (String n : arr)
	            System.out.println(n);
	}
}
