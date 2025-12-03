package year;

public class MultiplesOF3 {
	static void printMultiples(int array[]) {
        int count = 0;

        for(int integer = 0; integer < arr.length; integer++) {
            if(array[integer] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Output = " + count);
    }
	public static void main(String[] args) {
		
	        int[] array = {3, 8, 12, 14, 17};
	        printMultiples(array);
	    }
	}
