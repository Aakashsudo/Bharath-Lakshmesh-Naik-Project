package year;

public class Bytes {

	public static void main(String[] args) {
		int a = 50;{
			if((a>127)&& (a<-123))
			{
				System.out.println("Within Range" +a); 
			}
			else {
				System.out.println("Not Within Range"+a);
			}
		}
				
		int b = 200;
		{
			if((b>127)&& (b<-123))
			{
				System.out.println("Within Range" +b); 
			}
			else {
				System.out.println("Not Within Range"+b);
			}
		}
		int c = -55;
		{
			if((c>127)&& (c<-123))
			{
				System.out.println("Within Range" +c); 
			}
			else {
				System.out.println("Not Within Range"+c);
			}
		}
		int d = 1000;
		{
			if((d>127)&& (d<-123))
			{
				System.out.println("Within Range" +d); 
			}
			else {
				System.out.println("Not Within Range"+d);
			}
		}
	}
	
	
}
