import java.util.*;
public class login {
	public static void login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("####################### Welcome to E-commerce #######################");
		System.out.println("                                Login                                 ");
		
		System.out.print("Enter Username:");
		String username=sc.next();
		
		System.out.print("Enter Password:");
		String password=sc.next();
		
		if(username.equals("p"))
		{
			if(password.equals("p"));
			{
				System.out.println();
				return;
			}
		}
		System.out.println("Login Fail!");
		return;
	}
}
