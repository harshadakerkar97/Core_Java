package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size : ");
		int n=sc.nextInt();
		ArrayList <ArrayList<Integer>> row=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.print("enter count of element : ");
			int d=sc.nextInt();
			ArrayList <Integer> col=new ArrayList<>();
			System.out.print("Enter element : ");
			for(int j=0;j<d;j++) {
				col.add(sc.nextInt());
			}
			row.add(col);
		}
		for(ArrayList<Integer> num:row) {
			System.out.println(num);
		}
		System.out.print("Enter no of query");
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			System.out.println("enter xth position :");
			int x=sc.nextInt();
			System.out.println("enter yth position :");
			int y=sc.nextInt();
			try {
				System.out.println("value : "+row.get(x-1).get(y-1));
			}catch(ArrayIndexOutOfBoundsException e) {
				System.err.println("Invalid position!!!");
			}
		}
		sc.close();

	}

}
