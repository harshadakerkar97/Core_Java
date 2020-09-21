
class MathOperation{
	static int add(int a,int b){
		return (a+b);
	}
	static int subtract(int a,int b){
		return (a-b);
	}
	static int multiply(int a,int b){
		return a*b;
	}
	static double power(int a,int b){
		return Math.pow(a,b);
	}
}

class Demo{
	public static void main(String args[]){
		System.out.println("Addition : "+MathOperation.add(5,4));
		System.out.println("Addition : "+MathOperation.subtract(5,4));
		System.out.println("Addition : "+MathOperation.multiply(5,4));
		System.out.println("Addition : "+MathOperation.power(5,4));
	}
}