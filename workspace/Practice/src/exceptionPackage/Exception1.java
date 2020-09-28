package exceptionPackage;

public class Exception1 {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			int div=a/b;
			System.out.println(div);
			int arr[]= {10,52};
			System.out.println(arr[2]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("Array out of bound exception");
		}

	}

}
