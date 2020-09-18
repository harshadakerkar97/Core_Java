import java.util.Scanner;

class AllPrime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1,num2,count=0;
		System.out.println("Enter Upper limit : ");
		num1=sc.nextInt();
		System.out.println("Enter Lower limit : ");
		num2=sc.nextInt();
		for(int i=num1;i<=num2;i++){
			count=0;
			
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0 && i!=0 && i!=1 && i!=2){
				System.out.println(i);
			}
		}
		num1=Math.sqrt(81);
		System
	}
}