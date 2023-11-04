package javaram;

import java.util.Arrays;

public class intersection1 {

	public static int[] inttersection(int[] num1,int [] num2) {
		boolean f=false;
		int pos=0;
		num1  = Arrays.stream(num1).distinct().toArray();
		num2  = Arrays.stream(num2).distinct().toArray();
	int [] b=new int[num1.length];
	
	for(int i=0;i<num1.length;i++) {
		for(int j=0;j<num2.length;j++) {
			
			if(num1[i]==num2[j]) {
				b[i]=num1[i];
				pos++;
				f=true;
				break;
				
			}
			
		
			
		}
		
	}
	
	int[] c=new int[pos];
	for(int i=0;i<pos;i++) {
		
	c[i]=	b[i];
		
	}
		return c;
		
		
	}
	public static int[] sort(int[] a) {
		
		Arrays.sort(a);
		return a;
		
		
	}
	public static void print(int[] a) {
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] n=inttersection(new int[] {1,4,1,1,1,1,1,1,1,1,1,99,2,3,4,5},new int[] {1,34,99,1,4,65});
		
		print(sort(n));
	}

}
