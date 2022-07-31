/*pr_10  Write a Java program to print the ASCII value of a given character*/

package Module_1;

import java.util.Scanner;

public class program_10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the character :-");
		char ch = sc.next().charAt(0);
		int a = ch;
		
		System.out.println("ASCII value of "+ch+" is :- "+a);
	}
}
