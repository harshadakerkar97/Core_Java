//Store name of weekdays in an array (starting from “Sunday” at 0 index). 
//Ask day position from user and print day name. Handle array index out of 
//bound exception and give proper message if user enter day index outside range (0-6). 
package day_10;

import java.util.Scanner;

//enum Day{
//	SUN(1),MON(2),TUE(3),WED(4),THU(5),FRI(6),SAT(7);
//	private int dayNo;
//	Day(int i){
//		dayNo=i;
//	}
//	int getNo() {
//		return dayNo;
//	}
//}
//public class DayQ58 {
//	public static void main(String[] args) {
//		Day day=Day.FRI;
//		System.out.println(day);
//		System.out.println(day.getNo());
//	}
//}

//--------------------------------------------------------------------------------------------
public class DayQ58{
	public static void main(String[] args) {
		System.out.print("Enter position : ");
		Scanner sc=new Scanner(System.in);
		String day[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int pos=sc.nextInt();
		try {
			System.out.println("corresponding day is : "+day[pos]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Please enter valid position....");
			a.printStackTrace();
		}
		sc.close();
	}
}
