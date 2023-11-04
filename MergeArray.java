
public class MergeArray {
public static int[] merge(int []input,int []input1) {
int []a=new int[input.length+input1.length];
//for(int i=0;i<5;i++) {
//a[i]=input[i];
for(int i=0;i<input.length;i++) {
	
	a[i]=input[i];
	
}
for(int i=input.length;i<a.length;i++) {
	
	a[i]=input[i-input.length];
}
//}
//for(int i=5;i<10;i++) {
//	a[i]=input1[i-5];
//	
//}
return a;		
		
	}


public static int[] arraytoset(int []input) {
	int []arr = new int[input.length];
	
	int pos=0;
	
	for(int i=0;i<input.length;i++) {
		boolean f=false;
		for(int j=0;j<arr.length;j++) {
			if(input[i]==arr[j]){
				f=false;
				break;}}
					if(f) {
				arr[pos]=input[i];
				pos++;}}
	int []a =new int[pos];
for(int i=0;i<pos;i++) {
	a[i]=arr[i];}
return a;}
public static void print(int[] a) {
	System.out.println();
	for (int i : a) {
		System.out.print(i + " ");
	}}

	

public static void main(String[] args) {
		// TODO Auto-generated method stub

int []x=merge(new int[] {1,3,4,5,6,4,6,6,6,6,6,6,},new int[] {1,2,3,4,5});
int [] y=arraytoset(x);
print(y);
}}