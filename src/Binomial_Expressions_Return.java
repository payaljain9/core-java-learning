import java.util.Scanner;
public class Binomial_Expressions_Return {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number=");
		int firstNumber=sc.nextInt();
		System.out.println("enter second number=");
		int secondNumber=sc.nextInt();
		int result1=firstExpression(firstNumber,secondNumber);
		System.out.println("a+b="+result1);
		int result2=secondExpression(firstNumber,secondNumber);
		System.out.println("(a*a)+(2*a*b)+(b*b)="+result2);
		int result3=thirdExpression(firstNumber,secondNumber);
		System.out.println("(a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b)"+result3);
		int result4=fourthExpression(firstNumber,secondNumber);
		System.out.println("(a*a*a*a)*(4*a*a*a*b)+(6*a*a*b*b)+(4*a*b*b*b)+(b*b*b*b)="+result4);
		int result5=fifthExpression(firstNumber,secondNumber);
		System.out.println("(a*a*a*a*a)*(5*a*a*a*a*b)+(10*a*a*a*b*b)+(10*a*a*b*b*b)+(5*a*b*b*b*b+b*b*b*b*b)="+result5);
	}
	public static int firstExpression(int a, int b)
	{
		int result=a+b;
		return result;
	}
	public static int secondExpression(int a, int b)
	{
		int result=(a*a)+(2*a*b)+(b*b);
		return result;
	}
	public static int thirdExpression(int a, int b)
	{
		int result=(a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b);
		return result;
	}
	public static int fourthExpression(int a, int b)
	{
		int result=(a*a*a*a)*(4*a*a*a*b)+(6*a*a*b*b)+(4*a*b*b*b)+(b*b*b*b);
		return result;
	}
	public static int fifthExpression(int a, int b)
	{
		int result=(a*a*a*a*a)*(5*a*a*a*a*b)+(10*a*a*a*b*b)+(10*a*a*b*b*b)+(5*a*b*b*b*b+b*b*b*b*b);
		return result;
	}
}
