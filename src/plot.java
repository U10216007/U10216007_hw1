import java.util.Scanner;

public class plot {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x :");
		int x = input.nextInt();
		
		System.out.println("f(x)= x^2 : "  + fx(x));
		System.out.println("g(x)= sin(x) : "  + gx(x));
		
		
		
	}
		
	public static double fx(int x){
		return x*x;
	}
	
	public static double gx(int x){
		return Math.sin(x);
		
	}
	
	
}
	

