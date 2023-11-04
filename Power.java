package javaram;

public class Power {
	public static int pow(int base, int pow) {
		int base1=1;
		for(int i=0;i<pow;i++) {
//			int base2=base;
//			
			 base1=base1*base;
		}
		return base1;
	}

	public static int binaryToDecimal(String binaryString) {
		int len = binaryString.length() ;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int num = binaryString.charAt(len-1-i)-48;
			
			num = (int)(num*pow(2, i));
			sum = sum + num;
			
		}
		return sum;
	
		
	}
	
	public static String bintooctal(int num) {
		String s = "";
		String s1 = "";
		char ch ;
		int r=0;
		while(num>0)
		{
		r=num%8;
		 s=s+r;
		num=num/8;
		
			
		}
		for (int i=0; i<s.length(); i++)
	      {
	        ch= s.charAt(i); //extracts each character
	        s1= ch+s1; //adds each character in front of the existing string
	      }

		return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int b=binaryToDecimal("101101");
	System.out.print(b);
}}
