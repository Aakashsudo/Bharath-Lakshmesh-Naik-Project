package year;
import java.util.Scanner;
public class arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
         int size= sc.nextInt();
         int array[] = new int[size];
         System.out.println("Enter" +size + "elements");
         for ( int integer=0;integer < size; integer++)
        	 arr[integer] = sc.nextInt();
         System.out.println("Entered array elements :");
         for(int integer=0;integer<size;integer++)
         {
        	System.out.println(arr[integer]) ;
         }
	}

}
