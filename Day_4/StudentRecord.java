import java.util.Scanner;
class Student{
	private int rollNo,age;
	private String name;
	private float score;
	Student(int rollNo,String name,int age,float score){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.score=score;
	}
	float getScores(){
		return this.score;
	}
	void display(){
		System.out.println("Roll no : "+rollNo
		+"\nName :"+name+"\nAge : "+age
		+"\nscore : "+score);
		System.out.println("==========================");
	}
}
class StudentRecord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[5];
		int rollNo,age;
		String name;
		float score;
		
		int op;
		while(true){
		System.out.println("Choose option : \n1.Add student record \n2.Display score\n3.Exit");
		op=sc.nextInt();
		switch(op){
			case 1:
				System.out.println("Enter 5 records : ");
				for(int i=0;i<s.length;i++){
					System.out.print("Enter roll no : ");
					rollNo=sc.nextInt();
					System.out.print("Enter Name : ");
					name=sc.next();
					System.out.print("Enter age : ");
					age=sc.nextInt();
					System.out.print("Enter Score : ");
					score=sc.nextFloat();
					s[i]=new Student(rollNo,name,age,score);
				}
				System.out.println("============================");
				break;
			case 2:
				System.out.print("Enter the range : ");
				int start=sc.nextInt();
				int last=sc.nextInt();
				for(int i=0;i<s.length;i++){
					if(s[i].getScores() > start && s[i].getScores()<= last){
						s[i].display();
					}
				}
				System.out.println("===================================");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option");
				break;
		}
		}
	}
}







