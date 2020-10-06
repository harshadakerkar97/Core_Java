package practice;

import java.util.Arrays;
import java.util.Scanner;

public class HackerrankRecurrence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int flag=1;
        for(int i=0;i<ch.length;i++){
            flag=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]!=' ' && ch[i]==ch[j]){
                    flag++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' '){
            System.out.print(ch[i]+":");
            for(int s=0;s<flag;s++){
                System.out.print("*");
            }
            System.out.println("\n");
            }
        }
	}
}
