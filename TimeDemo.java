package year;
import java.util.Scanner;
public class TimeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (1 to 24): ");
        int hour = sc.nextInt();

        String result = printTime(hour);
        System.out.println(result);
    }

    public static String printTime(int hour) {

        if(hour >= 1 && hour <= 12) {
            return hour + " AM"; 
        }
        else if(hour > 13 && hour <= 24) {
            return (hour - 12) + " PM";
        }
        else {
            return "Invalid hour";
        }
    }
}
