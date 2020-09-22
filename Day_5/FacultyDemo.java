import java.util.Scanner;
class Faculty{
	private int facultyId;
	private double salary;
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Enter faculty id : ");
		facultyId=sc.nextInt();
	}
	void setSalary(double salary){
		this.salary=salary;
	}
	void printSalary(){
		System.out.println("Salary : "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	private double basicsal;
	private double allowance;
	void input(){
		super.input();
		System.out.print("Enter basic salary : ");
		basicsal=sc.nextDouble();
		System.out.print("Enter allowance : ");
		allowance=sc.nextDouble();
		setSalary(basicsal+allowance);
	}
}

class PartTimeFaculty extends Faculty{
	private double hour;
	private double ratePH;
	void input(){
		super.input();
		System.out.print("Enter working hours : ");
		hour=sc.nextDouble();
		System.out.print("Enter rate per hour : ");
		ratePH=sc.nextDouble();
		setSalary(hour*ratePH);
	}
	
}

class FacultyDemo{
	public static void main(String args[]){
		System.out.println("For full time faculty : ");
		FullTimeFaculty  f=new FullTimeFaculty();
		f.input();
		f.printSalary();
		System.out.println("-------------------------");
		System.out.println("For Part time faculty : ");
		PartTimeFaculty  p=new PartTimeFaculty();
		p.input();
		p.printSalary();
	}
}