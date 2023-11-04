package javaram;

public class Matrix {
 public static float average(int [] n) {
	 
	 int l=n.length;
	float sum=0;
	
	 for (int i : n) {
		sum=sum+i;
	}
	 
float li = sum/l;
	 
	return li;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(new int[] {1,2}));
	}

}
