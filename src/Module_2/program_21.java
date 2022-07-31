/*Write a java program which will ask  
the user to enter his/her marks (out of 100). Define a method that will 
display grades according to the marks entered as below:
MarksGrade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
*/

package Module_2;

import java.util.Scanner;

class display{
	
		int marks[]= new int[6];
		int i;
		float total=0,avg=0;
	
	public void show() {
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=4;i++)
		{
			System.out.print("Enter Marks of subjects:-");
			marks[i]=sc.nextInt();
			total = total+marks[i];
		}
		System.out.println("Total is :-"+total);
		
		avg= total/5;	
	
		System.out.println("Average is :-"+avg);
		
		System.out.print("The student Grade is: ");
	    if(avg>=91 && avg<=100)
	    {
	        System.out.print("AA");
	    }
	    else if(avg>=81 && avg<=90)
	    {
	       System.out.print("AB");
	    } 
	    else if(avg>=71 && avg<=80)
	    {
	        System.out.print("BB");
	    }
	    else if(avg>=61 && avg<=70)
	    {
	    	System.out.println("BC");
	    }
	    else if(avg>=51 && avg<=60)
	    {
	    	System.out.println("CD");
	    }
	    else if(avg>=41 && avg<=50)
	    {
	    	System.out.println("DD");
	    }
	    else if (avg<=40)
	    {
	        System.out.print("Fail");
	    }
	    else {
	    	System.out.println("Invalid");
	    }
	}
	
}

public class program_21 {
	

	public static void main(String[] args) {
		
		display d = new display();
		d.show();
	}
}
