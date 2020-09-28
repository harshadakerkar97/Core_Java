package day_9;

import java.util.Scanner;

public class FirstLetterQ56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		sc.close();
		char ch;
		String rem;
		for(int i=0;i<str1.length;i++) {
			ch=str1[i].toUpperCase().charAt(0);
			rem=str1[i].substring(1);
			System.out.print(ch+rem+" ");
		}
	}
}
