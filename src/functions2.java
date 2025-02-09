
public class functions2 {
	public static void main(String args[])
	{
		System.out.println("entry point...");
		add(20,20);
		sub(20,30);
		div(20,50);
		mul(6,0);
		
	}
	public static void add(int a, int b)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c= a+b;
		System.out.println("addition="+c);
	}
	public static void sub(int a, int b)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c= a-b;
		System.out.println("subtraction="+c);
	}
	public static void mul(int a, int b)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c= a*b;
		System.out.println("multiplication="+c);
	}
	public static void div(int a, int b)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c= a/b;
		System.out.println("division="+c);
	}
}