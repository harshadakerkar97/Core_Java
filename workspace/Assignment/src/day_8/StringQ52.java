package day_8;

import java.util.Scanner;

public class StringQ52 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter name of person : ");
		String name=scan.nextLine();
		int count=0;
//		System.out.println(name);
		for(int i=0;i<name.length();i++) {
			char ch=name.toLowerCase().charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default: 
				continue;
					
			}
			
		}
		System.out.println("Number of vowels : "+count);
		scan.close();
	}

}
