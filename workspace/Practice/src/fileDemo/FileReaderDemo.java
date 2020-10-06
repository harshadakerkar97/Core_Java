package fileDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my4.txt");
		int ch=-1;
		while((ch=f.read())!=-1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println("Success");
		
	}
}
