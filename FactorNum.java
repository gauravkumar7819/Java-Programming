
public class FactorNum {
public static int factorofNumber(int n) {
	
	for(int i=1;i<n+1;i++) {
		
		
		if(n%i==0) {
			return i;
		}
	}
	return 0;

	
	
}
	public static void main(String[] args) {
		
		
		System.out.println(factorofNumber(12));
		// TODO Auto-generated method stub

	}

}
