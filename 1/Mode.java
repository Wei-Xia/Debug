//calculate the mode of given integer

import java.util.*;

public class Mode {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int mode = 1;
		if(n<10)
			System.out.println("Mode is "+ n);
		else{
			while (n>9)
			{
				mode = mode *10;
				t= t/10; 
			}
			System.out.println("Mode is "+ mode);
		}

		
	}
}