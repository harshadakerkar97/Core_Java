package practice;

public class StringEquals {
	public static void main(String[] args) {
		System.out.println("equals() method demo");
		String s1="hello";
		String s2="hello";
		String s4=s2;
		String s3=new String("hello");
		String s5=s3;
		String s6=new String("welco");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s5));
		System.out.println(s3==s2);
		System.out.println(s6.equals(s3));
		System.out.println(s6==s3);
	}
}
