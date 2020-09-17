import java.util.Scanner;
class SimpleInterest{
	public static void main(String args[]){
		int p,t;
		double r,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount : ");
		p=sc.nextInt();
		System.out.println("Enter time : ");
		t=sc.nextInt();
		System.out.println("Enter rate : ");
		r=sc.nextDouble();
		a=p*(1+(r*t));
		System.out.println("Simple interest : "+a);
	}
}