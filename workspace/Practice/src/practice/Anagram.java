package practice;

import java.util.Arrays;

public class Anagram {
//	static boolean check(String a,String b) {
//		char temp;
//		if(a.length()!=b.length())
//			return false;
//		else {
//			char ch1[]=a.toLowerCase().toCharArray();
//			char ch2[]=b.toLowerCase().toCharArray();
//			for(int i=0;i<a.length();i++) {
//				for(int j=i+1;j<a.length();j++) {
//					if(ch1[i]>ch1[j]) {
//						temp=ch1[i];
//						ch1[i]=ch1[j];
//						ch1[j]=temp;
//					}
//				}
//			}
//			for(int i=0;i<a.length();i++) {
//				for(int j=i+1;j<a.length();j++) {
//					if(ch2[i]>ch2[j]) {
//						temp=ch2[i];
//						ch2[i]=ch2[j];
//						ch2[j]=temp;
//					}
//				}
//			}
//			for(int i=0;i<a.length();i++) {
//				if(ch1[i]!=ch2[i])
//					return false;
//			}
//			return true;	
//		}
//	}
	//--------------easy method-------------------
	static boolean check(String a, String b) {
		if(a.length()!=b.length())
			return false;
		else {
			char ch1[]=a.toLowerCase().toCharArray();
			char ch2[]=b.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.parallelSort(ch2);
			return Arrays.equals(ch1, ch2);
		}
	}
	public static void main(String[] args) {
		if(check("catkk","kactl"))
			System.out.println("Anagram");
		else
			System.out.println("Not anagram....");
	}


}
