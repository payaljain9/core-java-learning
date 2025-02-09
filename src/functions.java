
public class functions {
	public static void main(String args[])
	{
		add(10,20);
		sub(20,10);
		div(20,10);
		mul(10,10);
		
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
