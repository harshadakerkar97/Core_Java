package fileDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my.txt");
		String s=" ";
		int ch=-1;
		while((ch=f.read())!=-1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println("\nSuccess");
	}
}	
