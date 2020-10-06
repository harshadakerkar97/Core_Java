package fileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my5.txt");
		BufferedReader b=new BufferedReader(f);
		String s=null;
		while((s=b.readLine())!=null) {
			System.out.println(s);
		}
		b.close();
		f.close();
		System.out.println("Success");
	}
}
