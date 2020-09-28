package practice;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str=sc.next();
		int len=str.length();
		int count;
		for(int i=0;i<len;i++) {
			count=1;
			for(int j=i+1;j<len;j++) {
				if(str.charAt(i)==str.charAt(j)) {
//					System.out.println(str.charAt(i));
					count++;
				}
			}
			System.out.println(str.charAt(i)+" is present "+count+" times");
		}
		sc.close();
	}
}
