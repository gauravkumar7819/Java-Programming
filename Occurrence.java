package javaram;

public class Occurrence {
public static int[] Occurrence1(int [] num1) {
	

int [] b=new int[num1.length];
	
	for(int i=0;i<num1.length;i++) {
		int pos=0;
		for(int j=1+1;j<num1.length;j++) {
			
			if(num1[i]==num1[j]) {
				b[i]=num1[i];
				pos++;
				
			}
			System.out.print(num1[i]+" count-"+pos );
		}}
	
	return b;
	
	
}

public static void print(int[] a) {
	System.out.println();
	for (int i : a) {
		System.out.print(i + " ");
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] s=Occurrence1(new int[] {1,2,2,3,4,5,4,5});
		
		print(s);
	}

}
