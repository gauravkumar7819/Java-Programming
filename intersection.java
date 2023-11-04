package javaram;

public class intersection {
	public static int[] arraytoset(int []input,int []input2 ) {
		
		
		int []arr = new int[input.length];
		int pos=0;
		
		for(int i=0;i<input.length;i++) {
			boolean f=false;
			for(int j=0;j<arr.length;j++) {
				if(input[i]==arr[j]){
					f=true;
					break;}}
						if(f) {
					arr[pos]=input[i];
					pos++;}}
				int []a =new int[pos];
				for(int i=0;i<pos;i++) {
					a[i]=arr[i];
					System.out.println(i);
}
				return a;}
	public static void print(int[] a) {
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}}
	public static void main(String[] args) {
	
int [] x= arraytoset(new int[]{1,3,2,3,4,5,0},new int[] {1,2,3,4}) ;
print(x);


	}
}