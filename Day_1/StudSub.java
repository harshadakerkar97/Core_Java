import java.util.Scanner;
public class StudSub{
	public static void main(String args[]){
	int num,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 5 subjects : ");
	for(int i=0;i<5;i++){
		num=sc.nextInt();
		sum+=num;
	}
	System.out.println("Total marks : "+sum);
	double p=(sum*100/500);
	System.out.println("Percentage : "+p+"%");
}
}