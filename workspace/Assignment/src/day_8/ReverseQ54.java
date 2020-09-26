package day_8;

import java.util.Scanner;

public class ReverseQ54 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		for(int i=(str.length())-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
