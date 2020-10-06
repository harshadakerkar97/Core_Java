package fileDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my.txt",true);
		String s="This is first line to write.";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.write('\n');
		s="This is second line to write.";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("Success");
	}
}
