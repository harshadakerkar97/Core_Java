abstract class Processor{
	int data;
	void show(){
		System.out.println("Data : "+data);
	}
	abstract void process();
}

class Factorial extends Processor{
	void process(){
		int n=5,sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		data=sum;
	}
	
}

class Circle extends Processor{
	void process(){
		double area;
		double rad=5.6;
		area=(3.14)*(rad*rad);
		data =(int)area;
	}
}

class AbstractDemo{
	public static void main(String args[]){
		Processor p=new Factorial();
		p.process();
		p.show();
		Processor p1=new Circle();
		p1.process();
		p1.show();
		
	}
}