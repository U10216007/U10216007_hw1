import java.util.Scanner;

public class plot {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x :");
		int x = input.nextInt();
		
		System.out.println(fx(x));
		
	}
		
	public static double fx(int x){
		return (x*x);
	
	}	
	
}
	

