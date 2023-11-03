
public class sumofarray {
	
	public static int Sumofarray(int[] input) {
		
		int sum=0;
		
		for(int i:input) {
			
			sum=sum+i;}
		
		return sum;
	}
public static void main(String args[]) {
	
	int[ ] x= {1,2,3,4,5,6};
	
	int p=Sumofarray(x);
	
	System.out.print(p);
	
	
	}
}