//Write a program to reverse every word of the String.
package day_9;

import java.util.Scanner;

public class ReverseWordQ57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		sc.close();
		String arr[]=str.split(" ");
		for(String s: arr) {
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
