import java.util.Scanner;

class Q29{
	public static void main(String args[]){
		int sum=0,count=0;
		int arr[][]=new int[][]{
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		System.out.println("Number of total 1d array : "+
			arr.length);
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
			System.out.println("Sum of "+(i+1)+"th 1d array : "
				+sum);
		}
	}
}