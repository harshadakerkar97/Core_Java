import java.util.Scanner;

class Series{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter the limit : ");
	num=sc.nextInt();
	for(int i=12;i<num;i+=10){
		System.out.print(i+",");
	}
	}
}