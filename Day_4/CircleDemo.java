import java.util.Scanner;
class Circle{
	private double radius;
	private double area;
	private float pi=3.142f;
	Scanner sc=new Scanner(System.in);
	void init(){
		System.out.print("Enter radius of circle : ");
		radius=sc.nextDouble();
	}
	void calculateArea(){
		area=pi*radius*radius;
	}
	void display(){
		System.out.println("===============================");
		System.out.println("Radius of cicle : "+radius
			+"\nArea of circle : "+area);
	}
}
class CircleDemo{
	public static void main(String args[]){
		//Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		c.init();
		c.calculateArea();
		c.display();
	}
}