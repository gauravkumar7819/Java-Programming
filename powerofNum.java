
public class powerofNum {
	public static int powerofNumber(int base,int exp) {
		int p=1;
		
		
		
		for(int i=1;i<exp+1;i++) {
			
			p=base*p;
		}
		System.out.print(p);
		if(exp<0) {
		
		return p+1;
		
		}
		else{return;}
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(powerofNumber(5,2));
	}
}
