package practice;
enum Day{
	SUN,MON,TUE,WED,THU,FRI,SAT;
}
public class EnumDemo {
	public static void main(String[] args) {
		Day d=Day.valueOf("WED");
		System.out.println(d);
	}
}
