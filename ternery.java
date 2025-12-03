package year;

public class ternary2 {

	public static void main(String[] args) {
		int a = 100000;
		int b = 100;
		int c = 300;
		int d = 45089;
		int e = 6900;
		int f = 100000;
		int g =7898;
		
		int largest = a > b ? a : b;
		largest = largest > c ? largest : c;
		largest = largest > d ? largest : d;
		largest = largest > e ? largest : e;
		largest = largest > f ? largest : f;
		largest = largest > g ? largest : g;
		System.out.println("Largest number: " + largest);


	}

}
