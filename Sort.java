
public class Sort {
public static int[] sorting(int[] input) {
	int a=0;
	 for (int i = 0; i < input.length; ++i) 
     {

         for (int j = i + 1; j < input.length; ++j)
         {

             if (input[i] > input[j]) 
             {

                 a =  input[i];
                 input[i] = input[j];
                 input[j] = a;

             }

         }
	
	
	
	
	
	
	
}
	return input;}
public static void print(int[] arr) {
	System.out.println();
	for (int i : arr) {
		System.out.print(i + " ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a[]=sorting(new int[]{67,15,7,8,10,1});
print(a);

}

}
