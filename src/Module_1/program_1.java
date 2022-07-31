 /*pr_1 Write a Java program to Take three numbers from the user and print the greatest number.*/
package Module_1;
import java.util.Scanner;
   
public class program_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the Number A:- ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Number B:- ");
		int b = sc.nextInt();

		System.out.print("Enter the Number C:- ");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}
