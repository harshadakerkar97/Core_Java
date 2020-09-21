class Employee{
	private static int empno;
	private double salary;
	private static double totalSal;
	Employee(double salary){
		empno++;
		this.salary=salary;
		totalSal+=salary;
	}
	void display(){
		System.out.println("Total Employee : "+empno
			+"\nTotal salary : "+totalSal);
	}
}

class EmployeeDemo{
	public static void main(String args[]){
		Employee e=new Employee(5000.7);
		Employee e1=new Employee(5000);
		Employee e2=new Employee(5000);
		e2.display();
		System.out.println("============");
		Employee e3=new Employee(5000);
		e3.display();
	}
}