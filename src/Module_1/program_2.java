/*pr_2  Write a Java program that takes the user to provide a single character  
		from the alphabet. Print Vowel or Consonant, depending on the user 
		input. If the user input is not a letter (between a and z or A and Z), or is a 
		string of length > 1, print an error message.*/
package Module_1;

import java.util.Scanner;

public class program_2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the character:-");
				
		String ch = sc.next();

		if(ch.length()>1)
		{
			System.out.println("Error! Enter only one character");
		}
			
		else if(ch.equals("a") || ch.equals("e") || ch.equals("u") || ch.equals("i") || ch.equals("o"))
		{
			System.out.println("The character "+ ch + " is vowel. ");
		}
		else if (ch.equals("A") || ch.equals("E") || ch.equals("U") || ch.equals("I") || ch.equals("O"))
		{
			System.out.println("The character "+ ch +" is vowel.");
		}
		else if(ch.charAt(0)>=65 && ch.charAt(0)<=122)
		{
			System.out.println("The character " + ch + " is Consonant");
		}	
		
		else {
			System.out.println("Please enter only character");
		}
	}
	
}
