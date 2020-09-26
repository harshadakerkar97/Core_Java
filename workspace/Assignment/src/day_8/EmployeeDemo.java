//Explain the importance of toString() and equals() method of the Object class 
//and override them on class Employee(empId,name,salary).  a. Create class for 
//main method(say XYZ),and accept five employees information and store in an array.
//Also ensure if entered empId already exist or not (use equals method).  
//b. Display all employee info using toString method.
package day_8;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private double salary;
	public Employee() {
		empid=0;
		name="";
		salary=0;
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	int getId() {
		return empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 employee details : ");
		int empid,count=0;
		String name;
		double salary;
		for(int k=0;k<3;k++) {
			System.out.print("Enter empid : ");
			empid=sc.nextInt();
			System.out.print("Enter name : ");
			name=sc.next();
			System.out.print("Enter salary : ");
			salary=sc.nextDouble();
			int flag=0;
			for(int j=0;j<count;j++) 
			{
				if(e[j].getId()==empid)
				{
					System.out.println("empid is already prsent");
					flag=1;
					k--;
					break;
				}
			}
			if(flag==0) {
				e[count]=new Employee(empid,name,salary);
				count++;
				System.out.println("Added successfully");
			}
		}
		for(Employee e1:e) {
			System.out.println(e1);
		}
		sc.close();
	}
}
