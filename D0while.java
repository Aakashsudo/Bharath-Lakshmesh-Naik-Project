package year;

import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int pwd = 696969;
		
		do {
			if(pwd==696969)
				
		      System.out.println("Enter your password :");
			else
				System.out.println("Incorrect Password "+"Enter your password :");
			pwd = sc.nextInt();
			
		} while(pwd!=696969);
		System.out.println("INCorrect pwd");

	}

}
