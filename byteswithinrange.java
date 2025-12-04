package year;

public class Bytes {

	public static void main(String[] args) {
		int alpha = 50;{
			if((alpha>127)&& (alpha<-123))
			{
				System.out.println("Within Range" +alpha); 
			}
			else {
				System.out.println("Not Within Range"+alpha);
			}
		}
				
		int beta = 200;
		{
			if((beta>127)&& (beta<-123))
			{
				System.out.println("Within Range" +beta); 
			}
			else {
				System.out.println("Not Within Range"+beta);
			}
		}
		int chin = -55;
		{
			if((chin>127)&& (chin<-123))
			{
				System.out.println("Within Range" +chin); 
			}
			else {
				System.out.println("Not Within Range"+chin);
			}
		}
		int data = 1000;
		{
			if((data>127)&& (data<-123))
			{
				System.out.println("Within Range" +data); 
			}
			else {
				System.out.println("Not Within Range"+data);
			}
		}
	}
	
	
}
