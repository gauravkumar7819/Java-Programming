
public class sumofevenodd {
	public static int sum(int [] input) {
		int e=0;
		int o=0;
		
		
		for(int i:input) {
			
			if(i%2==0)
			{
				e++;
			}
			else {o++;
		}
		}
		return e;
	}
	
	public static void main(String args[]) {
		int[] x= {1,2,3,4};
		System.out.println(sum(x));
		
	}
}
