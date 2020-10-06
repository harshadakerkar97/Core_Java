package fileDemo;
import java.io.*;
public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my.txt");
		DataInputStream d=new DataInputStream(f);
		int i=d.readInt();
		String s=d.readUTF();
		double dd=d.readDouble();
		System.out.println(i+" "+s+" "+dd);
		d.close();
		f.close();
		System.out.println("Success");
	}
}
