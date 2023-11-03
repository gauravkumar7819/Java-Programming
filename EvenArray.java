
public class EvenArray {
public static int evenArrayodd(int []input) {
	int count=0;
	int odd=0;
	for(int i:input) {
		if(i%2==0) {
			
			count++;
		}
			else {
				
				odd++;
			}
		
		return count;
		
	}
	
	
	
	return odd;
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,4,6};
System.out.print(evenArrayodd(a));
	}

}
