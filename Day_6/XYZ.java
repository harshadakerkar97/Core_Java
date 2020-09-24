interface Taxable{
	double saletax=0.07;
	double incomeTax=0.105;
	void calcTax();
}

class Employee implements Taxable{
	int empid;
	String name;
	double salary;
	Employee(int empid,String name,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public void calcTax(){
		double tax=incomeTax*salary;
		System.out.println("Yearly tax : "+tax);
	}
}

class Product implements Taxable{
	int pid;
	double price;
	int quantity;
	Product(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void calcTax(){
		double sale = (saletax*(price*quantity));
		System.out.println("Total sale : "+ sale);
	}
}

class XYZ{
	public static void main(String args[]){
		Employee e=new Employee(1,"abc",50000.50);
		Product p=new Product(2,450.50,2);
		e.calcTax();
		p.calcTax();
	}
}












