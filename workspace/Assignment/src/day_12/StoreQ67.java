//Write a program to read data from shopping.dat file creted 
//in above problem and find total money spent on all shopping items. . 
//(Use ObjectInputStream to read Item class object).

package day_12;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StoreQ67 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new 
				FileInputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\store.dat");
		ObjectInputStream ois =new ObjectInputStream(fis);
		StoreDetails s=(StoreDetails)ois.readObject();
		System.out.println(s.toString());
		ois.close();
		fis.close();	
	}
}
