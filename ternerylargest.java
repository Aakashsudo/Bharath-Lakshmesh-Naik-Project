package year;

public class ternary3 {

	public static void main(String[] args) {
		int a= 70;
		int b=56;
		int c=154;
		String data=((a>b)&&(a>c))?a+" is largest value":(b>c)?b+ "is largest value":c+"is largest value";
		System.out.println(data);
	}

}
