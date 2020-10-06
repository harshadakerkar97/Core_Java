package multithreading;

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Current thread : "+Thread.currentThread().getId()+"Started");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(350);
			}catch(InterruptedException e) {
				
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Current thread : "+Thread.currentThread().getId()+"finished");
		
	}
	
}


public class ThreadDemo3 {
	public static void main(String[] args) {
		//System.out.println("Main started");
		System.out.println("main Current thread : "+Thread.currentThread().getId()+"Started");
		MyRunnable1 m=new MyRunnable1();
		Thread th=new Thread(m,"Thread 1");
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Main finished");
		System.out.println("main Current thread : "+Thread.currentThread().getId()+"finished");
		
	}
}
