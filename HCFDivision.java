package javaram;

public class HCFDivision {
	public static int hcf(int num1,int num2) {
		int temp;
		if(num2>num1) {
			temp=num1;
			
			num1=num2;
			
			num2=temp;
			
		}
		while (true) {
			
			if(num2%num1==0) {
				
				return num1;
			}
			else {
				
			
	int tem	=num1;
			num1=num2%num1;
			num2=tem;
			System.out.println();
			}
			
		}	
	}
public static void main(String[] args) {
System.out.println(hcf(18, 90));
}
}
