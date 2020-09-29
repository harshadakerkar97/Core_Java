//Create Interface StudentFee and declare following method. 
//getFee() throws InvalidFeeException. This method ask fees 
//from user and throws exception if user enters invalid or
//negative fees Create class Student with members (name, fees) and implement the StudentFee Interface.

package day_10;

import java.util.Scanner;

class InvalidFeeException extends Exception{
	public InvalidFeeException(String str) {
//		System.out.println(str);
		super(str);
	}
}

interface StudentFee{
	 void getFee() throws InvalidFeeException;
}

class Student implements StudentFee{
	private String name;
	private double fees;
	Scanner sc=new Scanner(System.in);
	public void getFee() throws InvalidFeeException{
		System.out.print("Enter Name of student :");
		this.name=sc.next();
		System.out.print("Enter fees : ");
		this.fees=sc.nextDouble();
		if(fees < 0) {
			throw new InvalidFeeException("Invalid Fees....");
		}
	}
	@Override
	public String toString() {
		return "Name : "+name+" Fees : "+fees;
	}
	
}
public class InvalidFeesQ60 {

	public static void main(String[] args){
		Student s=new Student();
		try {
			s.getFee();
			System.out.println(s);
		}catch(Exception e) {
			System.out.println("Exception occured : "+e);
		}
	}

}
