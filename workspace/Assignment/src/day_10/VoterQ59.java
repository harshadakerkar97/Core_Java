//Create a class Voter(voterId, name, age) with parameterized constructor. 
//The parameterized constructor should throw a checked exception 
//if age is less than 18. The message of exception is “invalid age for voter ” 

package day_10;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		System.out.println(str);
	}
	
}

class Voter{
	private int voterId;
	private String name;
	private int age;
	public Voter(int voterId, String name, int age) throws InvalidAgeException {
		this.voterId = voterId;
		this.name = name;
		if(age>18)
			this.age = age;
		else
			throw new InvalidAgeException("Invalid age.....");
	}
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class VoterQ59 {
	public static void main(String[] args){
		try {
			Voter v=new Voter(101,"abcd",14);
			System.out.println(v);
		}catch(Exception e) {
		//	System.out.println(e);
		}
	}
}
