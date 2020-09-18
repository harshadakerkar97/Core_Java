import java.util.Scanner;

class SumArray{
	public static void main(String args[]){
		int arr[]=new int[10];
		int sum=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of all elements : "+sum);
		avg=(sum / 10.0);
		System.out.println("Average of 10 elements : "+avg);
	}
}