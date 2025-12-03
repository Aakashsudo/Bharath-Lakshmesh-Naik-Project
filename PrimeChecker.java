package year;
import java.util.Scanner;
public class PrimeChecker {

	public static boolean primeNumberFinder(int number) {
        if (number < 2) {
            return false;
        }

        for (int intger = 2; integer * integer <= number; integer++) {
            if (number % integer == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (primeNumberFinder(num)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
