package javaram;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
public class inter {
public static int[] intersection(int[]  n,int [] m) {
	n=Arrays.stream(n).distinct().toArray();
	m=Arrays.stream(m).distinct().toArray();
	int[] n1=new int[n.length];
	boolean f=false;
	int pos=0;
	for (int i = 0; i < n.length; i++) {
		for (int j = 0; j < m.length; j++) {
			if(n[i]==m[j]) {
				
				f = true;
				pos++;
				break;
				
			}
			if (f) {
				n1[i]=m[i];
				
			}
			
		}
	}
	
	int[] n2=new int[n.length];
	for (int i = 0; i < pos; i++) {
		n2[i]=n[i];
		
	}
	
	Arrays.sort(n2);
	n2=Arrays.stream(n2).distinct().toArray();
	return n2 ;
	
}
public static void print(int[] a) {
	System.out.print("{");
	for (int i : a) {
		System.out.print(i + "");
		
	}
	System.out.print("}");}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int []a=new int[]{ 1,12,2,2,2,2, 5, 6 };
		int []b=new int[]{ 1,4,5,6,2,2, 5, 6 };
		int []c=intersection(a,b);
//		System.out.println(Array.toString(c));
		print(c);
	}

}
