import java.lang.Math;
class Expression{
	public static void main(String args[]){
		int x=4,y=0;
		System.out.println("A] y = x2 + 3x - 7");
		y=(int)(Math.pow(4,2) + 3*x - 7);
		System.out.println("Value of  y = "+y);
		System.out.println("----------------------------------------");
		System.out.println("B] y = x++ + ++x");
		y=x++ + ++x;
		System.out.println("Value of  y = "+y);
		System.out.println("----------------------------------------");
		System.out.println("C] z = x++ - --y - --x  +  x++");
		int z= x++ - --y - --x + x++;
		System.out.println("Value of  z = "+z);
		System.out.println("----------------------------------------");
		System.out.println("D] c = a && b || !(a || b)  ");
		boolean a=true,b=false,c;
		c= a&&b || !(a||b);	
		System.out.println("Value of  c = "+c);
		System.out.println("----------------------------------------");
	}
}