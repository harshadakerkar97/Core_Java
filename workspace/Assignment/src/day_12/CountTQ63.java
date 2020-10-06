//Write a program to count how many times character ‘t’ occurs in a file. 
package day_12;

import java.io.FileInputStream;
import java.io.IOException;

public class CountTQ63 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\demo.txt");
		int ch=-1;
//		String str="";
		int count=0;
		while((ch=fis.read())!=-1) {
			if((char)ch=='t')
				count++;
		}
		fis.close();
		System.out.println("t present :"+count+" times");
	}
}
