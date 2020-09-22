import java.util.Scanner;
class Tiles{
	private int squareLength;
	Tiles(int squareLength){
		this.squareLength=squareLength;
	}
	int getLength(){
		return squareLength;
	}
}

class FloorNo{
	private float rectLength;
	private float rectWidth;
	FloorNo(float rectLength,float rectWidth){
		this.rectLength=rectLength;
		this.rectWidth=rectWidth;
	}
	void totalTiles(Tiles t){
		int squareLength=t.getLength();
		float row=rectWidth/squareLength;
		float col=rectLength/squareLength;
		int totalTiles=(int)(row*col);
		System.out.println("Total tiles required to cover floor : " 
		+totalTiles);
	}
	
}

class Floor{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of square tiles : ");
		int sl=sc.nextInt();
		Tiles t=new Tiles(sl);
		System.out.print("Enter floor length :");
		float len=sc.nextFloat();
		System.out.print("Enter floor width :");
		float width=sc.nextFloat();
		FloorNo f=new FloorNo(len,width);
		f.totalTiles(t);
	}
}