
public class Sumofdi {
	public static int sumofDigit(int x) {
		int sum=0;
		while(x>0) {
			sum=x%10+sum;
		x=x/10;
				
	}return sum;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(sumofDigit(12335));
		
	}

}
