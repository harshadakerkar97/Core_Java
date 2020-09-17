import java.util.Scanner;
class Circle{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double rad;
		System.out.println("Enter Radius of circle : ");
		rad=sc.nextDouble();
		double area,circumference;
		area=3.14*rad*rad;
		System.out.println("Area of circle : "+area);
		circumference=2*3.14*rad;
		System.out.println("Circumference of circle : "+circumference);
	}
}