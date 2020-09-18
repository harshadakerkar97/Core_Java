import java.util.Scanner;

class RevArray{
	public static void main(String args[]){
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		n=sc.nextInt();
		char arr[]=new char[n];
		System.out.println("Enter values of array : ");
		for(int a=0;a<n;a++){
			arr[a]=sc.next().charAt(0);
		}
		for(int a=n-1;a>=0;a--){
			System.out.print(arr[a]);
		}
	}
}