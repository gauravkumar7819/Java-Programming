package javaram;
import java.util.*;
public class Quadratic_e {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the coefficient of x^2");
		int a=sc.nextInt();
		System.out.println("Enter the coefficient of x");
		int b=sc.nextInt();
		System.out.println("Enter the constant");
		int c=sc.nextInt();
		
		int p=(int) Math.pow(b, 2);
		System.out.println(p);
		
		int p1=p-4*a*c;
		int p3=(int) Math.pow(p1, .5);
		int p4=-(-b-p3);
		int p5=-(-b+p3);
		int p6=p5/(2*a);
		int p7=p4/(2*a);
		System.out.println(p6 +" ,"+p7);
	}

}
