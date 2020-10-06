package fileDemo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path path=Paths.get("fileDemo\\dir");
		System.out.println(path.toString());
		System.out.println(path.isAbsolute());
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getNameCount());
		System.out.println(path.getParent());
		System.out.println(path.getName(0));
		
		System.out.println(path.toAbsolutePath().toString());
	}
}
