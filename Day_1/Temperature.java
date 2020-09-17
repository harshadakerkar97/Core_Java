import java.util.Scanner;
class Temperature{
	public static void main(String args[]){
		double f,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit : ");
		f=sc.nextDouble();
		c=5*((f-32)/9);
		System.out.println("Temp in celsius : "+c);
	}
}