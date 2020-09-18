import java.util.Scanner;

class PrimeNo{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int flag=0;
		if(num==1 || num==2 || num==0)
			System.out.println("Not a prime number.");
		else{
		for(int i=2;i<=num;i++){
			if(num%2==0){
				flag++;
				break;
			}
		}
		if(flag==0){
			System.out.println("Prime number.");
		}else{
			System.out.println("Not a prime number.");
		}
		}
	}
}