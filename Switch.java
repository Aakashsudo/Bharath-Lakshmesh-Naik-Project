package year;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pizza size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("4. Very Large");
        System.out.println("5. Double extra Large");

        int choice = sc.nextInt();
        int price;

        switch (choice) {
            case 1:
            price = 125;
                System.out.println("Small Pizza Price = Rs " + price);
                break;

            case 2:
                price = 250;	
                System.out.println("Medium Pizza Price = Rs " + price);
                break;

            case 3:
                price = 300;
                System.out.println("Large Pizza Price = Rs " + price);
                break;

            case 4:
                price = 350;
                System.out.println("Very Large Pizza Price = Rs " + price);
                break;
             case 5:
                price = 600;
                System.out.println("Double Extra Large  Pizza Price = Rs " + price);
                break;

            default:
                System.out.println("Invalid size selected!");
        }
    }

	}
