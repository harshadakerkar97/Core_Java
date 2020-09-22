import java.util.Scanner;
class Student{
	private int rollNo;
	private float percentage;
	Student(){
		rollNo=0;
		percentage=0;
	}
	Student(int rollNo,float percentage){
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
	void show(){
		System.out.println("Roll No : "+rollNo+
			"\nPercentage : "+percentage);
	}
	double getPercentage(){
		return percentage;
	}
	int getId(){
		return rollNo;
	}
}

class CollegeStudent extends Student{
	private int semister;
	CollegeStudent(){
		semister=0;
	}
	CollegeStudent(int rollNo,float percentage,int semister){
		super(rollNo,percentage);
		this.semister=semister;
	}
	void show(){
		super.show();
		System.out.println("Semister : "+semister);
	}
	
}

class SchoolStudent extends Student{
	private String className;
	SchoolStudent(){
		className="";
	}
	SchoolStudent(int rollNo,float percentage,String className){
		super(rollNo,percentage);
		this.className=className;
	}
	void show(){
		super.show();
		System.out.println("Class name : "+className);
	}
	String getClassName(){
		return className;
	}
}

class StudentDemo{	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[5];
		s[0]=new SchoolStudent(1,45.5F,"10th");
		s[1]=new SchoolStudent(2,80.65F,"12th");
		s[2]=new CollegeStudent(3,74.6F,6);
		s[3]=new CollegeStudent(4,60.56F,1);
		s[4]=new SchoolStudent(5,98.6F,"10th");
		/*for (Student s1 : s){
			s1.show();
			System.out.println("-------------------");
		}*/
		System.out.println("=========================");
		int id;
		String ans;
		System.out.print("Enter roll no : ");
		id=sc.nextInt();
		/*for(Student s1: s){
			if(s1.getId()==id){
				s1.show();
			}
		}*/
		for(int i=0;i<s.length;i++)
		{
			if(id==s[i].getId())
			{
				if(s[i] instanceof SchoolStudent)
				{
					System.out.println("School Student");
				}else{
					System.out.println("College Student");
				}
			}
		}
		System.out.println("=========================");
		int count=0;
		for(Student s1: s){
			if(s1.getPercentage() > 75){
				count++;
			}	
		}
		System.out.println("Number of Students having A grade : "+count);
	}
}
