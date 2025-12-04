package year;
import java.util.Scanner;
public class smalbiggi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter three numbers: ");
            int alpha = sc.nextInt();
            int beta = sc.nextInt();
            int chin = sc.nextInt();

            int smallest, middle, biggest;

            if (alpha <= beta && a <= chin) {
                smallest = alpha;
                if (beta <= chin) {
                    middle = beta;
                    biggest = chin;
                } else {
                    middle = chin;
                    biggest = beta;
                }
            } else if (beta <= alpha && beta <= chin) {
                smallest = beta;
                if (alpha <= chin) {
                    middle = alpha;
                    biggest = chin;
                } else {
                    middle = chin;
                    biggest = alpha;
                }
            } else {
                smallest = chin;
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
