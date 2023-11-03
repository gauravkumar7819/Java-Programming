

public class anticlock{
//	public static void rotate(int[] input) {
//	
//		int temp = input[0];
//		for (int i =0; i <input.length-1; i++) {
//			input[i] = input[i+1];
//		}input[input.length-1] = temp;
//	}public static void ArrayRotateNTime(int[] input,int n) {
//		for(int i = 0 ;i < n ;i++)
//			 rotate(input);
//	}
	public static void print(int[] arr) {
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		print(a);
//		ArrayRotateNTime(a,16);
		print(a);
	}

}