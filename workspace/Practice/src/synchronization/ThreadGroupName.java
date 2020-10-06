package synchronization;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		//System.out.println();
	}
	
}


public class ThreadGroupName {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("G-1");
		
		Thread th1=new Thread(tg,new MyRunnable());
		Thread th2=new Thread(tg,new MyRunnable());
		Thread th3=new Thread(tg,new MyRunnable());
		
		th1.start();
		th2.start();
		th3.start();
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			
		}
		
		tg.stop();
	}
}
