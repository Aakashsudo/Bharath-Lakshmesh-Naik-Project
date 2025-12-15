package year;
import java.util.Arrays;
import java.util.Scanner;
public class EvenOddarray {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int evenCount = 0, oddCount = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) evenCount++;
	            else oddCount++;
	        }

	      
	        int[] evenArr = new int[evenCount];
	        int[] oddArr = new int[oddCount];

	        
	        int eIndex = 0, oIndex = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) evenArr[eIndex++] = num;
	            else oddArr[oIndex++] = num;
	        }

	        System.out.println("Even array: " + Arrays.toString(evenArr));
	        System.out.println("Odd array: " +Arrays.toString( oddArr));

	        sc.close();
	    }
	}
