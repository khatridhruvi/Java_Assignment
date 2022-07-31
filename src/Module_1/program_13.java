/* pr_13 Write a Java program to print numbers between 1 to 100 which are  
		 divisible by 3, 5 and by both*/

package Module_1;

public class program_13 {
	public static void main(String[] args) {
	
		System.out.println("\n\t------- All numbers which divisible by 3 -------\n");
		
		for(int i=1;i<=100;i++) {
			if(i%3==0)
			{		
				System.out.print(i+",");
			
			}				
		}
		
		System.out.println("\n\n\t------- All numbers which divisible by 5 -------\n");
		
		for(int i=1;i<=100;i++) {
			if(i%5==0) 
			{
				System.out.print(i+",");
			}
		}
			
		System.out.println("\n\n\t------- All numbers which divisible by 3 and 5 -------\n");
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+",");
			}
		}
	}
}
