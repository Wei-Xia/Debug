import java.util.*;

public class Yeah {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int sum;
		int i;
		int [] a = {1, 20, 35};
		int [] b = {10, 30, 45};
		for (int k=0; k<a.length; k++){
			sum = 0;
			for (i=a[k]; i<=b[k]; i++){
				sum = sum +i ;
			}
		}
		
	}
}