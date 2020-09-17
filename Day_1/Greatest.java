import java.util.Scanner;

class Greatest{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1 > num2 && num1 > num3){
			System.out.println("Greatest of 3 number is : "+num1);
		}else if(num2 > num1 && num2 > num3){
			System.out.println("Greatest of 3 number is : "+num2);
		}else{
			System.out.println("Greatest of 3 number is : "+num3);
		}
		int num=(num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
		System.out.println("\nGreatest no : "+num);
	}
}