import java.util.Scanner;
class Eligible{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String gender;
		int age;
		System.out.println("Enter gender and age of person : ");
		gender=sc.next();
		age=sc.nextInt();
		if(age >= 21){
			System.out.println("You are eligible for marriage!!!");
		}
		else
		{
			System.out.println("Sorry You are not eligible for marriage....");
		}
	}
}