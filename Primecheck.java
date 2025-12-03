package year;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;   // 0, 1 and negative numbers are not prime
        } else {
            for (int integer = 2; integer <= number / 2; integer++) {
                if (number % integer == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number.");
        else
            System.out.println(number + " is NOT a Prime Number.");
    }

}
