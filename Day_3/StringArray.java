import java.util.Scanner;

class StringArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next();
		}
		System.out.println("Given string array : ");
		for(String s:arr){
			System.out.println(s);
		}
	}
}