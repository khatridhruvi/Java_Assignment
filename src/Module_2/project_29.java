/*pr_29 W.A.J.P to create a class Student with attributes roll no, name, age and 
course. Initialize values through parameterized constructor. If age of 
student is not in between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special 
symbols raise exception "NameNotValidException". Define the two 
exception classes.*/

package Module_2;

class Student {
	int roll_no,age;
	String name,course;
	
	public Student(int r_no,String Sname,int s_age,String s_course) {
		this.roll_no = r_no;
		this.name= Sname;
		this.age= s_age;
		this.course= s_course;
	}
}

public class project_29 {
	public static void main(String[] args) {
		
	}
}
