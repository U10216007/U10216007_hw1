import java.util.Scanner;

public class plot {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x :");
		int x = input.nextInt();
		
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 E e = new E();
		 F f = new F();
		 G g = new G(); 
 		 H h = new H();
		 
		System.out.println("f(x)= x^2 : "  + b.fx(x));
		System.out.println("g(x)= sin(x) : "  + c.fx(x));
		System.out.println("h(x)= cos(x) : "  + d.fx(x));
		System.out.println("j(x)= tan(x) : "  + e.fx(x));
		System.out.println("k(x)= cos(x) + 5sin(x) : "  + f.fx(x));
		System.out.println("n(x)= 5cos(x) + sin(x) : "  + g.fx(x));
		System.out.println("m(x)= log(x) + x^2 : "  + h.fx(x));
		
	}
}	

abstract class A{ 
	abstract double fx(int x);
}

class B extends A{

	public double fx(int x){
		return x*x;
	}
}	
	
	
class C extends A{
	
	public double fx(int x){
		return Math.sin(x);
		
	}
}	

	
class D extends A{
	
	public double fx(int x){
		return Math.cos(x);
	}
}
	
class E extends A{

	public double fx(int x){
		return Math.tan(x);
	}
}	
	
class F extends A{
	public double fx(int x){
		return Math.cos(x) + 5*Math.sin(x);
	}
}


class G extends A{	
	public double fx(int x){
		return 5*Math.cos(x) + Math.sin(x);
	}
}
	
class H extends A{
	public double fx(int x){
		return Math.log(x) + x*x;
	}
}	
	
