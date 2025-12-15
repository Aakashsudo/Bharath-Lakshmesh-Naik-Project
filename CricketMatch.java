package year;
import java.util.Scanner;
public class CricketMatch {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		         
		                System.out.println(" 1st Match ");
		                System.out.print("Enter Batting 1st score: ");
		                int m1_first = sc.nextInt();

		                System.out.print("Enter Batting 2nd score: ");
		                int m1_second = sc.nextInt();

		                if (m1_second > m1_first + 6) {
		                    System.out.println("Invalid score!");
		                } else if (m1_second > m1_first) {
		                    System.out.println("Batting 2nd team wins!");
		                } else if (m1_first > m1_second) {
		                    System.out.println("Batting 1st team wins!");
		                } else {
		                    System.out.println("Match tied!");
		                }

		               
		                System.out.println("\n2nd Match ");
		                System.out.print("Enter Batting 1st score: ");
		                int m2_first = sc.nextInt();

		                System.out.print("Enter Batting 2nd score: ");
		                int m2_second = sc.nextInt();

		                if (m2_second > m2_first + 6) {
		                    System.out.println("Invalid score!");
		                } else if (m2_second > m2_first) {
		                    System.out.println("Batting 2nd team wins!");
		                } else if (m2_first > m2_second) {
		                    System.out.println("Batting 1st team wins!");
		                } else {
		                    System.out.println("Match tied!");
		                }
		                System.out.println("\n3rd Match");
		                System.out.print("Enter Batting 1st score: ");
		                int m3_first = sc.nextInt();

		                System.out.print("Enter Batting 2nd score: ");
		                int m3_second = sc.nextInt();

		                if (m3_second > m3_first + 6) {
		                    System.out.println("Invalid score!");
		                } else if (m3_second > m3_first) {
		                    System.out.println("Batting 2nd team wins!");
		                } else if (m3_first > m3_second) {
		                    System.out.println("Batting 1st team wins!");
		                } else {
		                    System.out.println("Match tied!");
		                }
		                System.out.println("\n 4th Match");
		                System.out.print("Enter Batting 1st score: ");
		                int m4_first = sc.nextInt();

		                System.out.print("Enter Batting 2nd score: ");
		                int m4_second = sc.nextInt();

		                if (m4_second > m4_first + 6) {
		                    System.out.println("Invalid score!");
		                } else if (m4_second > m4_first) {
		                    System.out.println("Batting 2nd team wins!");
		                } else if (m4_first > m4_second) {
		                    System.out.println("Batting 1st team wins!");
		                } else {
		                    System.out.println("Match tied!");
		                }

		                sc.close();
		            }
		        }
