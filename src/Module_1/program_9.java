/*pr_9 Write a Java program to count the letters, spaces, numbers and other  
	   characters of an input string*/

package Module_1;

import java.util.Scanner;

public class program_9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		
		System.out.print("\nString is :-" +str);
		 
		int l=0,s=0,n=0,o=0;
		 
		char[] ch= str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			{
				l++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				n++;
			}
			else if(ch[i]==' ')
			{
				s++;
			}
			else
			{
				o++;
			}
		}
		System.out.print("\nLetter is :-"+l);
		System.out.print("\nNumbers is :-"+n);
		System.out.print("\nspace is :-"+s);
		System.out.print("\nOther is :-"+o);
	}
}
