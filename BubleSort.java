package year;

public class BubleSort {
	 static void bubbleSort(int arr[]) {
	        int n = arr.length;

	        for(int i = 0; i < n - 1; i++) {
	            for(int j = 0; j < n - i - 1; j++) {
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
