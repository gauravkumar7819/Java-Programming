public class Ram7StrongNum {
	
public static boolean  StongNum(int num) {
	int r=0;
	int d=num;
	int fact=1;
	while(num>0) {
		
		r=num%10;
		
		num=num/10;
		for(int i=1;i<r;i++) {
			fact=fact*i;
	}
		System.out.print(fact);
}
	
	if(fact==d) return true;
	
	
	
	else return false;
	
}
	public static void main(String args[]) {
		System.out.print(StongNum(145));
	}
}
