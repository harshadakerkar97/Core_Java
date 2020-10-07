//Write a Java program to iterate through all elements in an array list. 
package collectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateListQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> al=new ArrayList<String>();
		al.add("blue");
		al.add("pink");
		al.add("yellow");
		al.add("black");
		al.add("red");
//		System.out.println(al);
		for(String s:al) {
			System.out.print(s+" ");
		}
		System.out.println("\n====");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n====");
		Iterator <String> it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n====");
		ListIterator <String> it1=al.listIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
	}

}
