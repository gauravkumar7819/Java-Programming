
public class Nearto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int sum=arr[0]+arr[1];
		int x=0,y=0;
		
		for(int i=0;i<arr.length;i++) {
			int test=0;
			for(int j=i+1;j<arr.length;j++) {
				test=arr[i]+arr[j];
				if(Math.abs(test)<Math.abs(sum)) {
					sum=test; 
					x=i;
					y=j;
							
				}
				
			}
		}

	}

}
