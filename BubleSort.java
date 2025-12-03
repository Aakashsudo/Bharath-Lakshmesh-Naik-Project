package year;

public class BubleSort {
	 static void bubbleSort(int arr[]) {
	        int number = arr.length;

	        for(int integer = 0; integer < number - 1; integer++) {
	            for(int java= 0; java < number - i - 1; java++) {
	                if(arr[j] > arr[j + 1]) {  
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.print("Sorted array: ");
	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	public static void main(String[] args) {
		 int[] arr = {50, 10, 20, 40, 30};
	        bubbleSort(arr);
	    }
	}
