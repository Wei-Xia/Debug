//change the order of the number that user inputs
//eg. input 365   output 563


import java.util.*;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y=x;
		int mode =1;

		while (y>=10){
			y=y/10;
			mode = mode*10;
		} 

		while (mode>0) {
			switch(x/mode){
				case 0: System.out.println("zero"); break;
				case 1: System.out.println("one"); break;
				case 2: System.out.println("two"); break;
				case 3: System.out.println("three"); break;
				case 4: System.out.println("four"); break;
				case 5: System.out.println("five"); break;
				case 6: System.out.println("six"); break;
				case 7: System.out.println("seven"); break;
				case 8: System.out.println("eight"); break;
				case 9: System.out.println("nine"); break;
				}
		}

		
/*
		do{
			int digit = y%10;
			
			y = y/10;
		}
*/

	}
	
}
