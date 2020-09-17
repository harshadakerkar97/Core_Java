import java.util.Scanner;

class Employee{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double sal,HRA,DA,GS;
		System.out.print("Enter basic salary of employee : ");
		sal=sc.nextDouble();
		if(sal < 10000){
			HRA=((10*sal)/100);
			DA=((90*sal)/100);
			GS=sal+HRA+DA;
			System.out.println("Basic salary = "+sal+"\nHRA = "+HRA+"\nDA = "
			+DA+"\nGS = "+GS);
		}
		else
		{
			HRA=2000;
			DA=((98*sal)/100);
			GS=sal+HRA+DA;
			System.out.println("Basic salary = "+sal+"\nHRA = "+HRA+"\nDA = "
			+DA+"\nGS = "+GS);
		}
	}
}
