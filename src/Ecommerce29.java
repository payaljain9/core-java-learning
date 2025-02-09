import java.util.*;
public class Ecommerce29 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		login.login();
		while(true)
		{
			System.out.println("1.Product Management");
			System.out.println("2.User Management");
			System.out.println("3.Quit");
			System.out.println("what would you like to do..?");
			int choice=sc.nextInt();
			if(choice==1)
			{
				ProductManagement29.productmanagement29();
				System.out.println();
			}
			else if(choice==2)
			{
				UserManagement29.usermanagement29();
				System.out.println();
			}
			else if(choice==3)
			{
				return;
			}
			else
			{
				System.out.println("invalid option...!");
			}
		}
		
	}
}
