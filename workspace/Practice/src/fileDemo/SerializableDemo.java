package fileDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
}

public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new 
				FileOutputStream("H:\\Java1\\Core_Java\\workspace\\Practice\\src\\fileDemo\\dir\\my3.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(new Employee(101,"Ram"));
		o.writeObject(new Employee(102,"sham"));
		f.close();
		System.out.println("Success");
	}
}
