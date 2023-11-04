package javaram;

public class one_plus {

	public static int [] one(int [] num1) {
		
		int [] n=new int[num1.length]	;
		for(int i=0;i<num1.length;i++) {
			if(i==num1.length) {
				n[i]=num1[i]+1;
			}
			n[i]=num1[i];
			
			
		}
		return n;
		
		
		
	}
	public static void print(int[] a) {
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []b =one(new int[] {1,2,3});
		
		print(b);
		
	}

}
