package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\abc1.txt");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		boolean b;
		//b=f.mkdir();	//creates directory
		//System.out.println(b);
		b=f.createNewFile();	//creates file
		System.out.println(b);
		
	}
}
