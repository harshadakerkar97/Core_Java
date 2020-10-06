package fileDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my4.txt");
		String s="this is file write using file writer";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("Success");
		
	}

}
