/* pr_11 Write a Java program that accepts an integer (n) and computes the value 
		 of n+nn+nnn.*/

package Module_1;

import java.util.Scanner;

public class program_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number :-");
		int num = sc.nextInt();
		
		System.out.println(num+"+"+num+num+"+"+num+num+num);
	}
}
