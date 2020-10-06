package synchronization;

class MyRunnable3 implements Runnable{
	PrintMessage p;
	public MyRunnable3(PrintMessage p) {
		this.p=p;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		p.printMsg();
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}

class PrintMessage{
	synchronized void printMsg() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}


public class SynchronizationDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread : "+Thread.currentThread().getName()+" Started");
		PrintMessage pm=new PrintMessage();
		MyRunnable3 m=new MyRunnable3(pm);
		Thread th=new Thread(m);
		Thread th1=new Thread(m);
		th.start();
		th1.start();
		System.out.println("main thread : "+Thread.currentThread().getName()+" finished");	
	}
}
