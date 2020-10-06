//Write a program to store your shopping details in a binary
//file(shopping.dat) with information itemName, price, quantity. 
//(Use ObjectOutputStream to store Item class object ).
package day_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class StoreDetails implements Serializable{
	private String itemName;
	private double price;
	private int quantity;
	StoreDetails(String item,double p,int q){
		this.itemName=item;
		this.price=p;
		this.quantity=q;
	}
	@Override
	public String toString() {
		return "itemName=" + itemName + ", price=" + price + ", quantity=" + quantity;
	}
	
}
public class StoreQ66 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new 
				FileOutputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\store.dat");
		ObjectOutputStream ois =new ObjectOutputStream(fos);
		String name="notebook";
		StoreDetails s[]=new StoreDetails[2];
		s[0]=new StoreDetails(name,100.56,5);
		s[1]=new StoreDetails("lipstick",550,10);
//		System.out.println(s);
		ois.writeObject(s[0]);
		ois.writeObject(s[1]);
		System.out.println(s);
		for(StoreDetails sd : s) {
			System.out.println(sd);
		}
		ois.close();
		fos.close();
	}
}
