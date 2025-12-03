package year;

public class CountConsecutiveEqual {

	public static void main(String[] args) {
		int[] array = {2, 2, 5, 5, 5, 9};
        int count = 0;

        for(int integer = 0; integer < array.length - 1; integer++) {
            if(array[integer] == array[integer + 1]) {
                count++;
            }
        }

        System.out.println("Count of side-by-side equal elements = " + count);

	}

}
