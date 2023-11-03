public class settoarry{
	public static int[] set(int[] input) {

		int[] arr = new int[input.length];
		int pos = 0;
		// fill(arr);
		int x = 0;
		for (int i = 0; i < input.length; i++) {
			boolean f = true;
			for (int j = 0; j < arr.length; j++) {
				if (input[i] == arr[j]) {
					f = false;
					break;
				}

				if (input[i] == 0 && x == 0) {
					x++;
					break;
				}

			}

			if (f) {

				arr[pos] = input[i];
				pos++;

			}

		}

		int[] a = new int[pos];

		for (int i = 0; i < pos; i++) {
			a[i] = arr[i];

		}
		return a;
	}

	public static void fill(int[] input) {

		for (int i = 0; i < input.length; i++) {
			input[i] = '\u2325';
		}
	}
		public static void print(int[] arr) {
			System.out.println();
			for (int i : arr) {
				System.out.print(i + " ");
			}
		
		}
	public static void main(String []args) {
		int []a= set(new int[]{1,2,3,1,3,4,5});
//		System.out.print(set(a));
		print(a);
		
	}

}
