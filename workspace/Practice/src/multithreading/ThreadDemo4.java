package multithreading;

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		int i;
		for(i=0;i<10;i++) {
			try {
				Thread.sleep(600);
			}catch(InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		//System.out.println();
		System.out.println(Thread.currentThread().getName()+" finished");
		
	}
	
}


public class ThreadDemo4 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread : "+Thread.currentThread().getName()+" Started");
		MyRunnable2 m=new MyRunnable2();
		Thread th=new Thread(m);
		Thread th1=new Thread(m);
		th.start();
		th1.start();
		//th.join();
		System.out.println("main thread : "+Thread.currentThread().getName()+" finished");	
	}
}
