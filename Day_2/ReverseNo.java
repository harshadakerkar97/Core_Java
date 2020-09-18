import java.util.Scanner;

class ReverseNo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num,rem,sum=0;
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		while(num!=0){
			rem=num%10;
			sum=(sum*10+rem);
			num/=10;
		}
		System.out.println("Reverse no : "+sum);
	}
}