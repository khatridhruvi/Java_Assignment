/*pr_5  Write a program in Java to input 5 numbers from keyboard and find their  
		sum and average using for loop.*/

package Module_1;

import java.util.Scanner;

public class program_5 {
	public static void main(String[] args) {

	    int i,num=0,sum=0;
	    float avg;
	    
	        System.out.println("Enter any 5 numbers : ");  
	 
	        for (i=0;i<5;i++)
	        {
	            Scanner sc = new Scanner(System.in);
	            num = sc.nextInt();
	 
	            sum +=num;
	        }
	        System.out.println("\nThe sum of 5 no is : " +sum);
	        
	        avg=sum/5;
	       	
	       System.out.println("\nThe Average is : " +avg);
	}
}
