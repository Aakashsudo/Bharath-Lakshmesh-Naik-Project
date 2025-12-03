package year;

public class CountConsecutiveEqual {

	public static void main(String[] args) {
		int[] arr = {2, 2, 5, 5, 5, 9};
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println("Count of side-by-side equal elements = " + count);

	}

}
