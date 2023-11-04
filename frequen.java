
public class frequen {
	public static void frequency(String s ) {
		
		
		
	int[] arr=new int[256];
	
	char[] chArr=s.toCharArray();
	for(char c:chArr) {
		
		
		arr[c]=arr[c]+1;
		
	}
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=0) {
			
			System.out.println((char)i+" ");
			System.out.print((arr[i]));
		}
		
	}
	}
		public static void main(String[] args) {
			
			
			frequency("aabbcc");

	}}


