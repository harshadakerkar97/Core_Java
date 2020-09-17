import java.util.Scanner;
public class YDays 
{
    public static void main(String args[])
    {
        int ndays, year, week, day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of days : ");
        ndays = sc.nextInt();
        year = ndays / 365;
        ndays = ndays % 365;
        System.out.println("years : "+year);
        week = ndays / 7;
        ndays = ndays % 7;
        System.out.println("weeks : "+week);
        day = ndays;
        System.out.println("days : "+day);
    }
}