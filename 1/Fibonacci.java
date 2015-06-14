//f(n) = 1+1+2+3+5+8+14+.....
//Fibonacci number

import java.util.*;

public class Fibonacci {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum = 0;
		int f = 0;
		for (int i=1; i<=n; i++){
			f = i*f;
			sum = sum + f;
		}
		System.out.println(sum);
		
	}
}