import java.util.Scanner;
import java.util.Arrays;
class SortArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter elements :  ");
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted list of elements : ");
		int temp=0,min;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*	Arrays.sort(arr);     (inbuild sort method)
		
			for(int i=num-1;i>=0;i--){
				System.out.println(arr[i]);
			}
		*/
		for(int a : arr){
			System.out.println(a);
		}
	}
}