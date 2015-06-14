//search K in array a, output True if there is k; output False if there is not k;

public class Search_Boolean {

/* Way #1	
	public static void search(int k, int[] a){
		boolean ret = false;
		for (int i=0; i<a.length; i++){
			if( a[i] ==k) {
				ret = true;
				break;
			}
		}
		return ret;
	}
*/

// Way #2
	public static void search(int k, int[] a){
		boolean ret = false;
		for (int h:a)
			if (h == k){
				ret = true;
				break;
			}
		return ret;
	}

}