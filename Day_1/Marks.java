import java.util.Scanner;
class Marks{
	public static void main(String args[]);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 5 subjects : ");
	int num,sum=0;
	for (int i=0 ;i<5 ;i++){
		num=sc.nextInt();
		sum+=num;
	}
	sum=(sum/500)*100;
	System.out.println("Percentage : "+sum);
}