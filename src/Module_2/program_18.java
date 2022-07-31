/*pr_19 We have to calculate the percentage of marks obtained in three subjects 
(each out of 100) by student A and in four subjects (each out of 100) by 
student B. Create an abstract class 'Marks' with an abstract method 
'getPercentage'. It is inherited by two other classes 'A' and 'B' each having 
a method with the same name which returns the percentage of the 
students. The constructor of student A takes the marks in three subjects 
as its parameters and the marks in four subjects as its parameters for 
student B. Create an object for each of the two classes and print the 
percentage of marks for both the students.*/

package Module_2;

abstract class Marks{
	abstract public float getpercentage();
}

class A extends Marks{
	int sum;
	A(int sub1,int sub2,int sub3){
		 sum = sub1+sub2+sub3;
	}
	
	@Override
	public float getpercentage() {
		// TODO Auto-generated method stub
		float per = (sum*100)/300; 
		return per;
	}
	
}

class B extends Marks{
	int sum;
	B(int sub1, int sub2,int sub3,int sub4){
		 sum = sub1+sub2+sub3;
	}
	
	@Override
	public float getpercentage() {
		// TODO Auto-generated method stub
		float per = (sum*100)/400;
		return per;
	}
	
}
public class program_18 {
	public static void main(String[] args) {
		A a = new A(89,78,50);
		System.out.println("Percentage of studet A is :-"+a.getpercentage());
		B b = new B(78,99,67,89);
		System.out.println("Percentage of student B is :-"+b.getpercentage());
		
	}
}
