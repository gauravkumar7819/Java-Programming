package javaram;

public class frequency {
	public static int[] arraytoset(int []input) {
		int []arr = new int[input.length];
		
		int pos=0;
		
		for(int i=0;i<input.length;i++) {
			boolean f=true;
			for(int j=0;j<arr.length;j++) {
				if(input[i]==arr[j]){
					f=false;
					break;}}
						if(f) {
					arr[pos]=input[i];
					pos++;}}
		int []a =new int[pos];
	for(int i=0;i<pos;i++) {
		a[i]=arr[i];}
	return a;
	}

	public static void frequenc(int[] input) {
		int[] vSet = arraytoset(input);
		for (int value : vSet) {
			int count = 0;
			for (int i : input) {
				if(i == value) count++;
			}
			
			System.out.println(value + " "+ count);
		}
	} 
	public static void print(int[] a) {
					System.out.println();
					for (int i : a) {
						System.out.print(i + " ");
					}}
	public static void main(String[] args) {
	
		
	int []a={ 1,1,1, 2, 3, 4,2,2,2,2,2,2,2,2,2,0, 5, 6 };
	frequenc(a);
	print(a);
	}
}