
public class methodoverloading {
	public static void main(String args[])
	{
		method1("payal");
		method1();
		method1("pccoe","nigdi");
		method1("payal",21);
		method1(21,"payal");
	}
	public static void method1()
	{
		System.out.println("hiii");
	}
	public static void method1(String a, String b)
	{
		System.out.println(a+" "+b);
	}
	public static void method1(int a, String b)
	{
		System.out.println("a="+a+" "+"b="+b);
	}
	public static void method1(String a, int b)
	{
		System.out.println("a="+a+" "+"b="+b);
	}
	public static void method1(String a)
	{
		System.out.println(a);
	}
}
