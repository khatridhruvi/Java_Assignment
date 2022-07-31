/*pr_8 Write a Java program that reads a positive integer and count the number  
	   of digits the number.
*/

package Module_1;

import java.util.Scanner;

public class program_8 {
	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer :- ");
		int integer = sc.nextInt();
		
		while(integer != 0)
		{ 
			integer /=10;
			count++;
		}
		System.out.println("The sum of digits is :-" +count);
	}
}
