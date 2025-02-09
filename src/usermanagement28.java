import java.util.Scanner;

public class usermanagement28 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                              ADDUSER                              ");
		System.out.print("Enter User Name:");
		String username=sc.nextLine();
		System.out.print("Enter Password:");
		String password=sc.nextLine();
		System.out.print("Enter Confirm Password:");
		String cpassword=sc.nextLine();
		if(password.equals(cpassword))
		{
			System.out.println("---------------------------------------------------------------");
			System.out.println("Username="+username+"\nPassword="+password);
			return;
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Add User Fail! Password Mismatch!");
	}
}
