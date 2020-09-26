package day_8;

import java.util.Scanner;

public class CountQ55 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		System.out.println("Number of words in string : "+arr.length);
	}
}
