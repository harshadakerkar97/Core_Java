package multithreading;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("Main started");
		MyThread thread=new MyThread();
		thread.start();
		//thread.run();
		System.out.println("\nMain finished");
	}

}
