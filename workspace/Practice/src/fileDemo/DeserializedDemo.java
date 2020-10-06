package fileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f=new FileInputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my3.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Employee emp =(Employee)o.readObject();
		System.out.println(emp);
		f.close();
		System.out.println("Success");
		
	}
}
