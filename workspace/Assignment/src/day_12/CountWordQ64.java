//Write a program to count no of words in a text file and average word size.

package day_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordQ64 {
	public static void main(String[] args) throws IOException {
		FileReader fis=new 
				FileReader("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\demo.txt"); 
		BufferedReader bf=new BufferedReader(fis);
		int count=0,len=0;
		String str="";
		while((str=bf.readLine())!=null) {
			String words[]=str.split(" ");
			count+=words.length;
			for(int i=0;i<words.length;i++) {
				len+=words[i].length();
			}
		}
		bf.close();
		System.out.println("No of words : "+ count);
		System.out.println("Avg word length : "+(len/count));
	}
}
