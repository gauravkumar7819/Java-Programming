package javaram;

import java.util.Arrays;

public class Solution {

	
	// only for test
	
//	public  static void rotate(int[][] matrix) {
//		int[][] result = new int[matrix.length][matrix.length];
//		for (int i = 0; i < result.length; i++) {
//			
//			for (int j = result.length-1; j>=0; j--) {
//				System.out.print(matrix[j][i]+" ");
//				
//			}
//			System.out.println();
//		}
//	}

	
//	public  static int[][] rotate(int[][] matrix) {
//		int[][] result = new int[matrix.length][matrix.length];
//		for (int i = 0,a = 0 ;i < result.length; i++,a++) {
//			
//			for (int j = result.length-1,b = 0; j>=0; j--,b++) {
//				 result[a][b] =  matrix[j][i];
//				
//			}
//			System.out.println();
//		}
//		
//		return result;
//	}
	
	
	public static void print(int[][] arr) {
		System.out.println();
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
	}
	public static void main(String[] args) {

		//int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] a = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//		a = rotate(a);
		print(a);
		
	}

}
