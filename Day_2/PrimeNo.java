import java.util.Scanner;

class PrimeNo{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int flag=0;
		if(num==1  || num==0)
			System.out.println("Not a prime number.");
		else{
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag++;
				break;
			}
		}
		if(flag==0){
			System.out.println("Prime number.");
		}else{
			System.out.println("Not a prime number.");
		}
		}
/*System.out.println("\nJava Version: "+System.getProperty("java.version"));
    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    System.out.println("Java Home: "+System.getProperty("java.home"));
    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");*/
	}
}