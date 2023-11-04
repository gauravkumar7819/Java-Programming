package javaram;


import java.util.Arrays;

public class two_sum {

	public static int countVal(int[] input, int val) {
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == val)
				count++;

		}
		return count;
	}
	
	 public static int[] searchRange(int[] nums, int target) {
		 int count = countVal(nums, target);
		
		 int[] res = new int[2];
		 res[0] = -1;
		 res[1] = -1;
		 int pos = 1;
		 for (int i = 0; i < nums.length; i++) {
			if( nums[i]== target && pos == 1) {
				res[0] = i;
				pos++;
			}
			
			else if( nums[i]== target && pos == count) {
				res[1] = i;
				break;
			}
			
			else if(nums[i]== target) {pos++;}
			
			
		}
		 
		 return res;
	        
	    }
	
	public static void main(String[] args) {
//		System.out.println(countVal(new int[] {1,2,3,4,1}, 1));
//		
	int[] a = searchRange(new int[] {5,7,7,8,8,10}, 9);
	System.out.println(Arrays.toString(a));
		
		
//		int[] a = searchRange(new int[] {5,7,7,8,8,10}, 6);
//		System.out.println(Arrays.toString(a));
//		
//		int[] a = searchRange(new int[] {}, 0);
//		System.out.println(Arrays.toString(a));
//		
//		
	}

}