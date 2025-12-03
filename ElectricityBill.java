package year;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of units consumed: ");
	        int units = sc.nextInt();

	        double cost = 0;

	        if (units < 30) {
	            cost = units * 3.50;
	        } 
	        else {   
	        	if (units < 50) {
	                cost = units * 4.25;
	            } 
	            else {  
	                if (units < 100) {
	                    cost = units * 5.25;
	                } 
	                else {   
	                    cost = units * 5.85;
	                }
	            }
	        }

	        System.out.println("Total Bill Amount = Rs " + cost);
	    }
	}

