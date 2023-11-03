
public class primeNu {
public static boolean primeNumberx(int x) {
	
	int count =0;
	
	for (int i=1;i<x+1;i++) {
		if (x%i==0) {
			
			count=count+1;
			
		}}
		if (count==2) {
			
			
		return true;
	}
	
	return false;}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean a=primeNumberx(42);

System.out.println(a);
	}

}
