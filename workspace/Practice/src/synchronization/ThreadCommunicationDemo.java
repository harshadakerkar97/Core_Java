package synchronization;

public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		Adder ad=new Adder();
		Reader rd=new Reader(ad);
		Thread th=new Thread(ad);
		Thread read=new Thread(rd);
		
		read.start();
		th.start();
	}
}

class Adder implements Runnable{
	int sum;
	boolean flag=false;
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			sum+=i;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		flag=true;
		notify();
		System.out.println("Notified==============");
	}
}

class Reader implements Runnable{
	Adder ad;
	
	public Reader(Adder ad) {
		this.ad=ad;
	}
	@Override
	public void run() {
		synchronized(ad) {
		if(!ad.flag) {
			try {
				System.err.println("Waiting for notify....");
				ad.wait();
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
			
		}
		System.out.println("Sum = "+ad.sum);
		System.out.println("flag = "+ad.flag);
		}
	}
	
}