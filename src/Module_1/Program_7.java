/*pr_7 Write a program in Java to make such a pattern like right angle triangle 
with number increased by 1
*/

package Module_1;

public class Program_7 {
	public static void main(String[] args) {
		int counter=1;
		for(int i= 1 ;i <=4 ;i++)
		 {
			 for(int j=1 ;j<=i;j++)
			 {
				 System.out.print(" "+counter);
				 counter++;
				
			 }
			 System.out.println(" ");
		 }
	}
}
