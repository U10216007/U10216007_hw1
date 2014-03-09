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
		System.out.println("k(x)= cos(x) + 5sin(x) : "  + kx(x));
		System.out.println("n(x)= 5cos(x) + sin(x) : "  + nx(x));
		System.out.println("m(x)= log(x) + x^2 : "  + mx(x));
		
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
	
	public static double kx(int x){
		return Math.cos(x) + 5*Math.sin(x);
	}
	
	public static double nx(int x){
		return 5*Math.cos(x) + Math.sin(x);
	}
	
	public static double mx(int x){
		return Math.log(x) + x*x;
	}
	
	
}
