import java.util.Scanner;

public class Ecommerce30 {
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
				productmanagement18.productmanagement18();
				System.out.println();
			}
			else if(choice==2)
			{
				usermanagemnt18.usermanagement18();
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
