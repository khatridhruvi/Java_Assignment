/*pr_25  W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
zero exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/

package Module_2;

import java.nio.channels.AlreadyBoundException;

public class program_25 {
	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]=30/0;
			
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be Zero.");
		}
		catch(AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
}
