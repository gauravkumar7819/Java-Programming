
public class ReverseOfNum {
	public static String reverseofNumber(int x) {
		
		
		String s="";
		
		while(x>0) {
			s=s+x%10;
		x=x/10;
				
	}
		
		return s;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(reverseofNumber(12345));
		
	}

}
