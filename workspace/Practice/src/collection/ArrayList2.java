package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static void main(String[] args) {
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		//by making generic we can restrict the 
//		//type of objects
//		//run time typecast exception will become 
//		//compiletime error
//		 
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
////		a.add("kl");
//		System.out.println(sum(a));
//	}
//	static int sum(ArrayList<Integer> a) {
//		int sum=0;
//		for(Integer o:a) {
////			Integer i=(Integer)o;
//			//No need to do downcating bcoz of generic
//			sum+=o;
//		}
//		return sum;
//	}
		ArrayList<Integer> al = new ArrayList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
  
        System.out.println("al : "+al);
        Iterator itr = al.iterator(); 
        while (itr.hasNext()) 
        { 
            int x = (Integer)itr.next(); 
            if (x < 10) 
                itr.remove(); 
        } 
  
        System.out.println("new : "+ al); 
    } 
} 


