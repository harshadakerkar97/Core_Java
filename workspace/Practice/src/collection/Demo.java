package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(40);
		l.add(20);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(l);
		
		///////////////////////////////////////////////
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(50);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		it=l1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			//it.remove();
//		}
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
	}
}
