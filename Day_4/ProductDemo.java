import java.util.Scanner;
class Product{
	private int pid;
	private float price;
	private int quantity;
	Product(int pid,float price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	void display(){
		System.out.println("PID : "+pid);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
		System.out.println("==========================");
	}
	float getPrice(){
		return (this.price);
	}
	static float maxPrice(Product pr[]){
		float total=0;
		for(int i=0;i<pr.length;i++){
			total+=(pr[i].price * pr[i].quantity);
		}
		return total;
	}
}

class ProductDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Product e[]=new Product[3];
		int pid,quantity;
		float price;
		for(int i=0;i<e.length;i++){
			System.out.print("Enter pid : ");
			pid=sc.nextInt();
			System.out.print("Enter price of product : ");
			price=sc.nextFloat();
			System.out.print("Enter quantity : ");
			quantity=sc.nextInt();
			e[i]=new Product(pid,price,quantity);
		}
		System.out.println("=========================");
		System.out.println("All Product details : ");
		for(Product p : e){
			p.display();
		}
		System.out.print("PID of Highest price product : ");
		float temp=0;
		for(int i=0;i<e.length;i++){
			temp=e[i].getPrice();
			for(int j=0;j<e.length;j++){
				if(temp < e[j].getPrice()){
					temp=e[j].getPrice();
				}
			}
		}
		System.out.println(temp);
		System.out.println("=========================");
		System.out.println("Total price spent : "+Product.maxPrice(e));
	}
}