import java.util.*;

public class Cool {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int [] a = new int[9];
		
		for (int i=0; i<a.length; i++)
			a[i] = (int)Math.random()*100;
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
		for (int k:a)
			System.out.println(k);
		
	}
}