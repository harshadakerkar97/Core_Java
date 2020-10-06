package fileDemo;
import java.io.*;
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("H:\\\\Java1\\\\Core_Java\\\\workspace\\\\Practice\\\\src\\\\fileDemo\\\\dir\\\\my2.txt");
		DataOutputStream d=new DataOutputStream(f);
		d.writeInt(123);
		d.writeUTF("ram");
		d.writeDouble(785.56);
		d.close();
		f.close();
		System.out.println("Success");
	}
}
