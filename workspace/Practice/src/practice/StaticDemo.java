package practice;

public class StaticDemo {
	static {
		System.out.println("I am static");
	}
	{
		System.out.println("I am instance block");
	}
	
	public static void main(String[] args){
		System.out.println("Main");
		StaticDemo s=new StaticDemo();
		
	}
}
