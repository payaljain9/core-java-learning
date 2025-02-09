import java.util.Scanner;

public class login24 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("####################### Welcome to E-commerce #######################");
		System.out.println("                                Login                                 ");
		
		System.out.print("Enter Username:");
		String username=sc.next();
		
		System.out.print("Enter Password:");
		String password=sc.next();
		
		if(username.equals("pccoe"))
		{
			if(password.equals("pccoe@24"));
			{
				System.out.println("Login Successful");
				return;
			}
		}
		System.out.println("Login Fail!");
	}
}
