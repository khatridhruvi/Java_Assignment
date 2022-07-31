/*pr_24 Take two numbers from the user and perform the division operation and 
handle Arithmetic Exception. O/PEnter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/

package Module_2;

import java.util.Scanner;

public class program_24 {
	public static void main(String[] args) {
int x ,y , z;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter i :-");
			x= sc.nextInt();
			System.out.print("Enter j:-");
			y= sc.nextInt();
			z= x/y;
			System.out.println("Division is :-"+z);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		} 
		
	}
}
