package javaram;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
public class setofarray {
public static int [] set(int [] num1) {
//	int [] a=new int[num1.length];
//	int pos=0;
//boolean f=true;
//
//for(int i=0;i<num1.length;i++) {
//	
//	for(int j=0;i<a.length;j++) {
//		if (num1[i]==a[j]) {
//			f=false;
//			break;
//			
//		}}
//		if(f) {
//			a[i]=num1[i];
//			pos++;
//		}
//		
//	
//	}
//	
//
//int [] b=new int[pos];
//	
//	for(int i=0;i<pos;i++) {
//		
//		b[i]=a[i];
//	}
//	return b;
//	
	
	Arrays.sort(num1, Collections.reverseOrder());
	return num1;
	
	}
	public static void print(int[] a) {
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]b=set(new int[]{5,4,9,2,5,8,9,7,5,4,3,1,2,3,3,3,4,5});
		print(b);
	}

}
