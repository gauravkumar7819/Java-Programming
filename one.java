package javaram;

import java.util.Arrays;

public class one {
	public static int arraytointeger(int [] num1) {
		int num=0;
		for(int i=0;i<num1.length;i++) {
			
			num=num*10+num1[i];
			}
		return num+1;
		
}
	public static String[] integertoarray(int  num) {
		String s=""+num;
		int l=s.length();
		String[] s1=new String[l];
		for(int i=0;i<l;i++)
		{
			s1[i]=""+s.charAt(i);
			
			
		}
		
		
	return s1;
	}
		
	
	public static void print(String[] s2) {
		System.out.println();
		for (String i : s2) {
			System.out.print(i + " ");
		}}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int b=	arraytointeger(new int[] {1,2,9});
	
		String[] s2=integertoarray(b);
		System.out.println(Arrays.toString(s2));
	

		
	
		
	}

}
