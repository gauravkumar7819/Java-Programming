
public class Factorial {

	public static int factorialofNumber(int n) {
		int fact=1;
		for(int i=1;i<n+1;i++) {
			fact=fact*i;
		}
		
		
		return fact;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(factorialofNumber(5));
	}

}
