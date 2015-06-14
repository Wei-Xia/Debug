//search K in array a, output the index of k in array a
import java.util.*;

public class Search_k {
	
	public static void search(int k, int[] a){
		int ret = -1;
		for (int i=0; i<a.length; i++){
			if( a[i] ==k) {
				ret = i;
				break;
				return ret;
			}


		}
		
	}

	public static void main(String [] args){
		int [] a = {1,3,4,5,8,11,12,16,18,21,22,23,28,38,45,46,100};
		System.out.println(search (45,a));
		}
}