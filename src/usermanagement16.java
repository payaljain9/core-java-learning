import java.util.ArrayList;
import java.util.Scanner;

import Collection.User;

public class usermanagement16 {
	public static void usermanagement16()
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<User> list=new ArrayList();
		while(true)
		{
			System.out.println("**************************USER MANAGEMENT************************");
			System.out.println("1.Add User\n2.Update User\n3.Delete User\n4.Display User\n5.Exit");
			System.out.println("what would you like to do:");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
			    User user=new User();
				System.out.println("**************************ADD USER************************");
				System.out.print("Enter user name:");
				user.name=sc.nextLine();
				System.out.print("Enter user password:");
				user.password=sc.nextLine();
				System.out.print("Enter user mail:");
				user.email=sc.nextLine();
				list.add(user);
			}
			else if(choice==2)
			{
				System.out.println("**************************UPDATE USER************************");
				System.out.println("to be updated soon....");
				
			}
			else if(choice==3)
			{
				System.out.println("**************************DELETE USER************************");
				System.out.println("to be updated soon....");
			}
			else if(choice==4)
			{
				System.out.println("**************************DISPLAY USER************************");
				for(User data:list)
				{
					System.out.println("user name:"+data.name+"\tpassword:"+data.password+"\temail:"+data.email);
				}
			}
			else if(choice==5)
			{
				return;
			}
			else
			{
				System.out.println("Invlid option");
			}
		}	
	}
}
