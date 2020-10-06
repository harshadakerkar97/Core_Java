package synchronization;

class MyRunnable4 implements Runnable{
	PrintMessage1 p;
	public MyRunnable4(PrintMessage1 p) {
		this.p=p;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		
			p.printMsg();
		
			
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}

class PrintMessage1{
	 void printMsg() {
		synchronized (this) {
			 for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}


public class SynchronizationDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread : "+Thread.currentThread().getName()+" Started");
		PrintMessage1 pm=new PrintMessage1();
		MyRunnable4 m=new MyRunnable4(pm);
		Thread th=new Thread(m);
		Thread th1=new Thread(m);
		th.start();
		th1.start();
		System.out.println("main thread : "+Thread.currentThread().getName()+" finished");	
	}
}
