import java.util.Scanner;

class DiagonalSum{
	public static void main(String args[]){
		int arr[][]=new int[3][3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
				if(i==j){
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("2D array : ");
		for(int a[]: arr){
			for(int b:a){
				System.out.print(" "+ b);
			}
			System.out.println();
		}
		System.out.println("Sum of diagonal elements : "+
			sum);
	}
}