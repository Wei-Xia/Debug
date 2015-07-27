//reorder an array.

public class Reorder {
	void sort(int [] a){
		for (int i =0; i<a.length; i++){
			int idx = 0;
			for (int j=1; j<a.length-1){
				if (a[j]>a[idx]){
					idx = j;
				}
			}

			int t= a[idx];
			a[idx] = a.[a.length-i-1];
			a[a.length-i-1] = t;
		}
	}


	public static void main(String [] args){
		int [] a = new int [6];
		for (int i=0; i<a.length; i++)
			a[i] = (int)(Math.random()*100);
		for (int k:a){
			System.out.print (k+ " ");
		}
		System.out.println();

		sort (a);
		for (int k:a){
			System.out.print (k+ " ");
		}
		System.out.println();
		}
}
