
public class Prime {
public static boolean primeNumber(int x) {
	
	int count=0;
	for(int i=1;i<x+1;i++) {
		if(x%i==0) {
			count=count+1;
		}
			
			
		}
	System.out.println(count);
	if(count==2) {
		return true;
	}
	return false;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeNumber(23));
	}

}
