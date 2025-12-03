package year;

public class BubleSort {
	 static void bubbleSort(int array[]) {
	        int number = array.length;

	        for(int integer = 0; integer < number - 1; integer++) {
	            for(int java= 0; java < number - i - 1; java++) {
	                if(arr[java] > arr[java + 1]) {  
	                    int temporary = arr[java];
	                    array[java] = arr[java + 1];
	                    array[java + 1] = temporary;
	                }
	            }
	        }

	        System.out.print("Sorted array: ");
	        for(int integer = 0; integer < number; integer++) {
	            System.out.print(array[integer] + " ");
	        }
	    }
	public static void main(String[] args) {
		 int[] array = {50, 10, 20, 40, 30};
	        bubbleSort(array);
	    }
	}
