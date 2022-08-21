/*pr_28 W.A.J.P to create a custom exception if Customer withdraw amount which 
is greater than account balance then program will show custom exception 
otherwise amount will deduct from account balance.
Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this 
transaction.
*/

package Module_2;

import java.util.Scanner;

public class program_28 {
	public static void main(String[] args)  {
		double current_bal = 2000;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to withdrawal:-");
        int withdraw_a = s.nextInt();
        
        try {
        if(current_bal<withdraw_a) {
        	throw new ArithmeticException("sorry , insufficient balance,you need more 500 RS.");
        }
        else {
        	System.out.println("Please Take The Money:-"+withdraw_a);
        }
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
