package year;
import java.util.Scanner;
public class SumNatural {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = 0;
        int integer = 1;

        while (integer <= number) {
            sum = sum + integer;
            integer++;
        }

        System.out.println("Sum of first " + number + " natural numbers = " + sum);
    }
}
