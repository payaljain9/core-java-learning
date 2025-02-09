
public class equations {
	public static void main(String args[])
	{
		equation1(10,20);
		equation2(5,20);
		equation3(10,100);
		equation4(3,20);
		equation5(7,2);
	}
	public static void equation1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void equation2(int a,int b)
	{
		int c=a+a;
		c=c+(2*a*b);
		c=c+(b*b);
		System.out.println(c);
	}
	public static void equation3(int a,int b)
	{
		int c=a*a*a;
		c=c+(3*a*a*b);
		c=c+(3*a*b*b);
		c=c+(b*b*b);
		System.out.println(c);
	}
	public static void equation4(int a,int b)
	{
		int c=a*a*a*a;
		c=c+(4*a*a*a*b);
		c=c+(6*a*a*b*b);
		c=c+(4*a*b*b*b);
		c=c+(b*b*b*b);
		System.out.println(c);
	}
	public static void equation5(int a,int b)
	{
		int c=a*a*a*a*a;
		c=c+(5*a*a*a*a*b);
		c=c+(10*a*a*a*b*b);
		c=c+(10*a*a*b*b*b);
		c=c+(5*a*b*b*b*b);
		c=c+(b*b*b*b*b);
		System.out.println(c);
	}
}
