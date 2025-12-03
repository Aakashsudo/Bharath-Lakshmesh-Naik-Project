package year;
import java.util.Scanner;
public class BooleanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		boolean isAdult = (age>=18);
		if(isAdult){
			System.out.println("He can vote");
		}
		else
		{
			System.out.println("He can't vote");
		}
		
	}
}
