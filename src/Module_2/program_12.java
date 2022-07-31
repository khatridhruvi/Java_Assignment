/*pr_12 Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same.*/

package Module_2;

class Member{
	
	 String name;
	 int age;
	 String number;
	 String add;
	 int salary;
	
	public Member(String name,int age,String number,String add,int salary) {
		this.name= name;
		this.age= age;
		this.number= number;
		this.add= add;
		this.salary=salary;
}
	
	public void printSalary() {
		System.out.println("Salary:-"+salary);
	}
}

class Employee extends Member{
		private String sp;
		public 	Employee(String name,int age,String number,String add,int salary,String sp){
		super(name,age,number,add,salary);
		this.sp=sp;
		System.out.println("-:Employee Details:-");
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);
		System.out.println("Phone number:-"+number);
		System.out.println("Address:-"+add);
		System.out.println("specialization:-"+sp);
		
	}
}

class Manager extends Member{
	
	private String dep;
	public Manager(String name,int age, String number,String add,int salary,String dep) {
		super(name,age,number,add,salary);
		this.dep=dep;
		System.out.println("\n\n\n-:Manager Details:-");
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);
		System.out.println("Phone number:-"+number);
		System.out.println("Address:-"+add);
		System.out.println("Department:-"+dep);
	}
}
public class program_12 {
	public static void main(String[] args) {
		Employee e = new Employee("Dhruvi",20,"972-432-8367","Bapunagar",10000,"IT");
		e.printSalary();
		Manager m = new Manager("Zankhana",22,"723-675-7890","Maninagar",10000,"Marketing");
		m.printSalary();
	}
}
