/*pr_17 Create an abstract class 'Bank' with an abstract method 'getBalance'.  
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
method named 'getBalance'. Call this method by creating an object of 
each of the three classes.
*/

package Module_2;

abstract class Bank{
	abstract public void getBalance();
}

 class BankA extends Bank{

	 
	@Override
	public void getBalance() {
	
		System.out.println("Deposited:- $100");
	} 
	
}
class BankB extends Bank{

	
	@Override
	public void getBalance() {
		
		System.out.println("Deposited:- $150");
	}
	
}
class BankC extends Bank{

	
	@Override
	public void getBalance() {
		
		System.out.println("Deposited:- $200");
	}
	
}

public class program_17 {
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
		
	}
}
