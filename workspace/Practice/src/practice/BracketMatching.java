package practice;

import java.util.Scanner;

public class BracketMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        char ch[]=str.toCharArray();
        int count1=0,count2=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='(')
                count1++;
            else if(ch[i]==')')
                count2++;
            else
                continue;
        }
        System.out.println(count1-count2);
	}

}
