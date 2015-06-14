//search K in array a, output the occurrence of K;

public class Search_Occurrence {

	public static void search(int k, int[] a){
		int ret = 0;
		for (int h : a)
			if (h==k){
				ret++;
			}
		return ret;
	}

}