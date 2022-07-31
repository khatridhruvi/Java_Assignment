/* pr_3 Write a Java program that takes a year from user and print whether that  
		year is a leap year or not. */

package Module_1;

import java.util.Scanner;

public class program_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year :- ");
		int year = sc.nextInt();
		
		 if(year%4==0 && year%100!=0 || year%400==0) 
		{
			System.out.println("This is a leap");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}
}
