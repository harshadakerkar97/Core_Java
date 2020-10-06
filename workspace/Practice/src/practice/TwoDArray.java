package practice;
import java.util.Scanner;
public class TwoDArray {
	public static void check(int arr[][]) {
		for(int i[]: arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		check(arr);
	}
}
