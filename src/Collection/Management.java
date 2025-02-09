package Collection;
import java.util.*;
public class Management {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Login login=new Login();
		login.login();
		while(true)
		{
			System.out.println("*******************MANAGEMENT******************");
			System.out.println("1.User Management\n2.Product Management\n3.Exit");
			System.out.print("what would you like to do:");
			int choice=sc.nextInt();
			if(choice==1)
			{
				UserManagement.usermanagement();
				System.out.println();
			}
			
			else if(choice==2)
			{
				ProductManagement.productmanagement();
				System.out.println();
			}
			else if(choice==3)
			{
				return;
			}
			else
			{
				System.out.println("Invlid option...");
			}
		}
	}
}
