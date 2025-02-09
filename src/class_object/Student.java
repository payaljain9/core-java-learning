package class_object;

public class Student {
	public String firstName;
	public String lastName;
	public String branchName;
	public String mobile;
	public int age;
	
	public void diplayFullName()
	{
		System.out.println("Full Name= "+firstName+" "+lastName);
	}
	public void displayBranchName()
	{
		System.out.println("Branch Name= "+branchName);
	}
	public void diplayMobile()
	{
		System.out.println("Mobile Number= "+mobile);
	}
	public void diplayAge()
	{
		System.out.println("Age= "+age);
	}
	public String displayMobileWithSTD(String std)
	{
		return std+mobile;
	}
}
