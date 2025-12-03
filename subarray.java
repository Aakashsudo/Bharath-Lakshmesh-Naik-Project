package year;
import java.util.Scanner;
public class Subarray {
public static int[] subArray(int[] arr, int start, int end) {
        int size = end - start + 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = arr[start + i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 21, 11, 43, 87};

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

       
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

      
        int[] sub = subArray(arr, start, end);

        System.out.println("Subarray:");
        for (int num : sub) {
            System.out.print(num + " ");
        }
    }
}
