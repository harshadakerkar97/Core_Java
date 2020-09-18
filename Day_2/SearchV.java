import java.util.Scanner;
class SearchV{
	public static void main(String args[]){
		int num,n,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter Values of array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter number to be search : ");
		num=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if(arr[i]==num){
				System.out.println(num + " is present at "+(i+1)+"th index");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(num+" is not present in array.");
		}
	}
}