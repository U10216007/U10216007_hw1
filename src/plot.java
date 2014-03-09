import java.util.Scanner;

public class plot {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x :");
		int x = input.nextInt();
		
		System.out.println("f(x)= x^2 : "  + fx(x));
		System.out.println("g(x)= sin(x) : "  + gx(x));
		System.out.println("h(x)= cos(x) : "  + hx(x));
		System.out.println("j(x)= tan(x) : "  + jx(x));
		
	}
		
	public static double fx(int x){
		return x*x;
	}
	
	public static double gx(int x){
		return Math.sin(x);
		
	}
	
	public static double hx(int x){
		return Math.cos(x);
	}
	
	public static double jx(int x){
		return Math.tan(x);
	}
	
}
