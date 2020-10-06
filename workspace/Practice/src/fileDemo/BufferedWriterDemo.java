package fileDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter f=
			new FileWriter("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my5.txt");
		BufferedWriter b =new BufferedWriter(f);
		String s="this is file write using buffered Writer";
		b.write(s);
		String s1="\nthis is second line";
		b.write(s1);
		b.newLine();
		b.write(s);
		b.flush();
		b.close();
		f.close();
		System.out.println("Success");
		
	}
}
