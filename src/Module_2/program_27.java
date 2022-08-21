/*pr_27 W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16*/

package Module_2;

import java.util.Scanner;

class Age {
	 
	public Age(int age) {
		System.out.println(age);
	}
}

public class program_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ur age :: ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new ArithmeticException("Invalid age");
			} else {
				System.out.println("Welcome to vote");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}