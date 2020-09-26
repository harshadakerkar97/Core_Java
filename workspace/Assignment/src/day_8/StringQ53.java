package day_8;

public class StringQ53 {
	public static void main(String[] args) {
		String input="67, 89, 23, 67, 12, 55, 66";
		String arr[]=input.split(", ");
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=Integer.parseInt(arr[i]);
		}
		int sum=0;
		System.out.println("Given array : ");
		for(int a:arr1) {
			System.out.print(a+" ");
			sum+=a;
		}
		System.out.println("\nSum of all integers : "+sum);
	}

}
