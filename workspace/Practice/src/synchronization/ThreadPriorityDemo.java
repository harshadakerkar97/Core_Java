package synchronization;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Counter c1=new Counter();
		Thread th1=new Thread(c1);
		th1.setPriority(Thread.NORM_PRIORITY+3);
		
		Counter c2=new Counter();
		Thread th2=new Thread(c2);
		th1.setPriority(Thread.NORM_PRIORITY-3);
		
		th1.start();
		th2.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
		c1.flag=false;
		c2.flag=false;
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}	
		System.out.println("c1 count : "+c1.count);
		System.out.println("c2 count : "+c2.count);
	}
}

class Counter implements Runnable{
	long count;
	volatile boolean flag=true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
			count++;
		}
	}
	
}