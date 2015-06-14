import java.util.*;

class Euclidean {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println ("Enter the first integer");
		int dividend = in.nextInt();
		System.out.println ("Enter the second integer");
		int divisor = in.nextInt();
		int remainder = 0;

		do{
			remainder = dividend%divisor;
			dividend = divisor;
			divisor = remainder;
		} while (remainder>0);

		System.out.println ("the greatest common divisor for and is "+remainder);
	
	}
}