/*pr_12 Write a Java program to display the system time*/

package Module_1;

import java.time.LocalDateTime;

public class program_12 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Date and time is :- "+ldt);
	}
}
