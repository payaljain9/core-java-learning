import java.util.ArrayList;
import java.util.Scanner;

public class usermanagemnt18 {
	public static void usermanagement18()
	{
		ArrayList<user> userlist=new ArrayList<>();
		while(true)
		{
			System.out.println("**************************USER MANAGEMENT************************");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Display User");
			System.out.println("5.Delete User");
			System.out.println("6.Quit");
			System.out.print("what would you like to do today?");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				user user=new user();
				System.out.println("-----------------------------ADD USER-----------------------");
				System.out.print("enter user name:");
				user.username=sc.nextLine();
				System.out.print("enter email:");
				user.email=sc.nextLine();
				System.out.print("enter user password:");
				user.password=sc.nextLine();
				userlist.add(user);
			}
			else if(choice==2)
			{
				System.out.println("-----------------------------UPDATE USER------------------------");
				System.out.print("enter user name to update:");
				String username=sc.nextLine();
				boolean f=false;
				for(user data:userlist)
				{
					if(data.username.equals(username))
					{
						System.out.print("enter new email:");
						data.email=sc.nextLine();
						System.out.print("enter new password:");
						data.password=sc.nextLine();
						System.out.println("user records updated successfully");
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("user records not found..!");
				}
			}
			else if(choice==3)
			{
				System.out.println("-----------------------------SEARCH USER------------------------");
				System.out.print("enter user name to search:");
				String username=sc.nextLine();
				boolean f=false;
				for(user data:userlist)
				{
					if(data.username.equals(username))
					{
						System.out.println("user present in records...");
						System.out.println(data.username+" "+data.email+" "+data.password);
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("user records not found..!");
				}
			}
			else if(choice==4)
			{
				System.out.println("-----------------------------DISPLAY USER------------------------");
				if(userlist.size()==0)
				{
					System.out.println("user records not available..!");
				}
				else
				{
					for(user data:userlist)
					{
						System.out.println("user name:"+data.username);
						System.out.println("user email:"+data.email);
						System.out.println("user password:"+data.password);
					}
				}
			}
			else if(choice==5)
			{
				System.out.println("-----------------------------DELETE USER------------------------");
				System.out.print("enter user name to remove:");
				String username=sc.nextLine();
				boolean f=false;
				for(user data:userlist)
				{
					if(data.username.equals(username))
					{
						userlist.remove(data);
						System.out.println("user records deleted successfully..!");
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("user not available..!");
				}
			}
			else if(choice==6)
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
