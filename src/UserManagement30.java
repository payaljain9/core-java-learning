import java.util.Scanner;
public class UserManagement30{
	public static void usermanagement30()
	{
		user3 u=new user3();
		while(true)
		{
			System.out.println("**************************USER MANAGEMENT************************");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Delete User");
			System.out.println("5.Quit");
			System.out.print("what would you like to do today?");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				System.out.println("-----------------------------ADD USER-----------------------");
				System.out.print("enter user name:");
				u.username=sc.nextLine();
				System.out.print("enter email:");
				u.email=sc.nextLine();
				System.out.print("enter user password:");
				u.password=sc.nextLine();
				System.out.println();
				System.out.println("user name:"+u.username);
				System.out.println("user email:"+u.email);
				System.out.println("user password:"+u.password);
			}
			else if(choice==2)
			{
				System.out.println("-----------------------------UPDATE USER------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==3)
			{
				System.out.println("-----------------------------SEARCH USER------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==4)
			{
				System.out.println("-----------------------------DELETE USER------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==5)
			{
				return;
			}
			else
			{
				System.out.println("enter valid option...");
			}
		}
	}
}
