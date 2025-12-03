package year;

public class MultiplesOf5 {
	static void printMultiples(int array[]) {
        int count = 0;

        for(int integer = 0; integer < arr.length; integer++) {
            if(array[integer] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Output = " + count);
    }
	public static void main(String[] args) {
		 int[] array = {5, 11, 20, 22, 26, 31};
	        printMultiples(array);

	}

}
