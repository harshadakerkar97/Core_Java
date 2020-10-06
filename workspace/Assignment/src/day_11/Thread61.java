//Create a Thread class to print following star (*)
//pattern on screen with delay of 1 second between each * 
//print. Number of lines in the pattern should be passed to
//the constructor of Thread class. 
//*  * * * *  * * * * * * * * * * Use this class in main
//method and ask user to enter number of lines to print.

package day_11;

import java.util.Scanner;

class ThreadDemo extends Thread{
	int n;
	ThreadDemo(int n){
		this.n=n;
	}
	@Override
	public void run() {
		for(int i=0;i<n;i++) {
			System.out.print("*"+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread61 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n=sc.nextInt();
		Thread th=new ThreadDemo(n);
		th.start();
		System.out.println("done");
	}

}
