package javaram;

import java.util.Arrays;

public class Merge {
public static int[] merge(int []input1,int []input2) {
int []a=new int[input1.length+input2.length];

for(int i=0;i<input1.length;i++) {
	
	a[i]=input1[i];
	
}
for(int i=0;i<input2.length;i++) {
	
	a[i+input1.length]=input2[i];
}

return a;		
		
	}



public static int[] deleteelement(int [] p,int target) {
	for (int i : p) {
	if(p[i]==target) {
		p[i]=p[i+1];
		break;
	}
	else {
		
		p[i]=p[i];
	}
		
	}
	
	
	
	
	return p;
	
}
	


public static void main(String[] args) {
		// TODO Auto-generated method stub

int []x=merge(new int[] {1,3,4,5,6,4,6,6,6,6,6,6,},new int[] {1,2,3,4,5});
Arrays.sort(x);
int [] y=Arrays.stream(x).distinct().toArray();
System.out.println(Arrays.toString(y));

}}