//search K in array a, output an array. The array is the list of index of K in array a;
// -1 means invalid.

public class Search_Array {

	public static int [] search (int k, int[] a) {
		int idx = 0;
		int [] loc = new int[a.length];
		for (int i=0; i<loc.length; i++)
			loc[i] = -1;
		for (int i=0; i<a.length; i++){
			if (a[i] ==k) {
				loc[idx++] = i;
			}
		}
		return loc;
	}
}