package multithreading;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Current thread : "+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(850);
			}catch(InterruptedException e) {
				
			}
			System.out.print(i+" ");
		}
	}
	
}


public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("Main started");
		MyRunnable m=new MyRunnable();
		Thread th=new Thread(m,"Thread 1");
		th.start();
		System.out.println("Main finished");
	}
}
