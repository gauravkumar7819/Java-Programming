package javaram;

public class LCM {
public static int lcmofNum(int num1,int num2) {
	int n=1;
	int temp;
	if(num2>num1) {
		temp=num1;
		
		num1=num2;
		
		num2=temp;
		
	}
	for(int i=1;num1>0;i++) {
		
		if(num1%i==0) {
			
			n=n*i;
		num1=num1/i;	
		if(num1==0) {
			
			return n;
		}
		}
	}
	
	return n;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1=	lcmofNum(14,122);
	System.out.print(n1);
		
	}

}
