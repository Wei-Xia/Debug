//search the Minimum value in the array

public class Search_Minimum {

	public static int max(int[] a){
		int ret = a[0];
		int idx = -1;
		for (int i=1; i<a.length; i++){
			if (a[i] > ret){
				ret = a[i];
				idx = i;
			}
		}

		return ret;
	}

	public static void main(String [] args){
		int [] a = {1,3,4,5,8,11,12,16,18,21,22,23,28,38,45,46,100};
		}
}