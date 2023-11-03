
public class Fibonacci {

	public static void fiboseries(int n) {
		
		int n1=0;
		int n2=1;
		System.out.print(n1+""+n2);
		for(int i = 1;i<n-3;i++) {
			
			n1=n1+n2;
			n2=n1+n2;
		
		System.out.print(n1+""+n2);
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiboseries(5);
	}

}
