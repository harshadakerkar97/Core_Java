//Create a class that checks whether a given number is prime or not using  Runnable interface.
package day_11;
import java.util.Scanner;
class MyRunnableDemo implements Runnable{
	private int n;
	public MyRunnableDemo(int n) {
		this.n=n;
	}
	@Override
	public void run() {
		int flag=0;
		if(n==0 || n==1) {
			System.out.println("Not prime number");
		}else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0) {
				System.out.println("prime number");
			}else
			{
				System.out.println("Not prime number");
			}
		}
	}
}

public class RunnableQ62 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		MyRunnableDemo rn=new MyRunnableDemo(n);
		Thread th=new Thread(rn);
		th.start();
		sc.close();
	}
}
