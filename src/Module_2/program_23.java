/*pr_23 W.A.J. P to demonstrate try catch block.*/

package Module_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program_23 {
	public static void main(String[] args) {
		int i ,j , k;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter i :-");
			i= sc.nextInt();
			System.out.println("Enter j:-");
			j= sc.nextInt();
			k= i/j;
			System.out.println("Division is :-"+k);
			System.exit(0); 
		} 
		catch (ArithmeticException e) {
			System.out.println("Denominator cannot be zero");
		} 
		catch (InputMismatchException e) {
			System.out.println(" you cannot enter the string");
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
