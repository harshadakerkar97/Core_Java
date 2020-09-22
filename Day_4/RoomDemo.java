import java.util.Scanner;
class OneBHK{
	private float roomArea,hallArea,price;
	private static int count;
	OneBHK(){
		roomArea=0;
		hallArea=0;
		price=0;
	}
	OneBHK(float roomArea,float hallArea,float price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
		//count++;
	}
	float getPrice(){
		return price;
	}
	void show(){
		count++;
		System.out.println("Room "+count+" : "+" - \nRoom area : "+roomArea
		+"\nHall area : "+hallArea+"\nPrice : "+price);
	}
}

class TwoBHK extends OneBHK{
	float room2Area;
	TwoBHK(){
		super();
		room2Area=0;
	}
	TwoBHK(float roomArea,float hallArea,float price,float room2Area)
	{
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show(){
		super.show();
		System.out.println("Room 2 area : "+room2Area);
	}
}

class RoomDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		TwoBHK t[]=new TwoBHK[3];
		System.out.println("Insert details : ");
		float ra,ha,p,ra2;
		for(int i=0;i<3;i++){
			System.out.print("Enter room area for 1BHK : ");
			ra=sc.nextFloat();
			System.out.print("Enter room area for 2BHK : ");
			ra2=sc.nextFloat();
			System.out.print("Enter hall area for 1BHK : ");
			ha=sc.nextFloat();
			System.out.print("Enter price : ");
			p=sc.nextFloat();
			t[i]=new TwoBHK(ra,ha,p,ra2);
			System.out.println("-------------------------");
		}
		System.out.println("===========================");
		System.out.println("Room details : ");
		double sum=0;
		for(TwoBHK tb: t){
			tb.show();
			sum+=tb.getPrice();
			System.out.println("===========================");
		}
		System.out.println("Total price for rooms : "+sum);
	}
}