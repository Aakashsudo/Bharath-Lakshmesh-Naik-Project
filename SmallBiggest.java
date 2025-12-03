package year;
import java.util.Scanner;
public class Smallbiggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter three numbers: ");
            int alpha = sc.nextInt();
            int beta = sc.nextInt();
            int character = sc.nextInt();

            int smallest, middle, biggest;

            if (alpha <= beta && alpha <= character) {
                smallest = alpha;
                if (beta <= character) {
                    middle = beta;
                    biggest = character;
                } else {
                    middle = charcter;
                    biggest = beta;
                }
            } else if (beta <= alpha && beta <= character) {
                smallest = beta;
                if (alpha <= character) {
                    middle = alpha;
                    biggest = character;
                } else {
                    middle = character;
                    biggest = alpha;
                }
            } else {
                smallest = character;
                if (alpha <= beta) {
                    middle = alpha;
                    biggest = beta;
                } else {
                    middle = beta;
                    biggest = alpha;
                }
            }

            System.out.println("Smallest = " + smallest);
            System.out.println("Middle   = " + middle);
            System.out.println("Biggest  = " + biggest);

            System.out.print("Do you want to try again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'yes' || choice == 'YES');
    }
}
