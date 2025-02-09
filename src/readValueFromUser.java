import java.util.*;
public class readValueFromUser {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number=");
		int firstNumber=sc.nextInt();
		System.out.println("enter second number=");
		int secondNumber=sc.nextInt();
		int result=firstExpression(firstNumber,secondNumber);
		System.out.println("result="+result);
	}
	public static int firstExpression(int a, int b)
	{
		int result=a*a+2*a*b+b*b;
		return result;
	}
}
