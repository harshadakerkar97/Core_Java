package fileDemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		File f=new File("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo");
		//String files[]=f.list();
		String files[]=f.list((ff,nm) -> nm.endsWith(".java"));
		//File files[]=f.listFiles(ff ->ff.isFile());
		for(String a:files) {
			System.out.println(a);
		}
	}
}
