import java.util.Scanner;

class SLargeNo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*for(int i:arr){
			for(int j:arr){
				if(i>j){
					temp=i;
					i=j;
					j=temp;
				}
			}
		}*/
		System.out.println("Sorted array is : ");
		for(int i : arr){
			System.out.println(i+" ");
		}
		System.out.println("Largest element from array : "+
			arr[(arr.length)-1]+"\nSmallest element from array :"
			+arr[0]);
	}
}