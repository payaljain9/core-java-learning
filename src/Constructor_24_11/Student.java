package Constructor_24_11;

public class Student {
	String fname;
	String lname;
	String mnumber;
	public Student()
	{
		fname="payal";
		lname="jain";
		mnumber="907845654";
		System.out.println("hiii");
		fname="Payal";
		student();
	}
	public Student(String fname, String lname, String mnumber)
	{
		this.fname=fname;
		this.lname=lname;
		this.mnumber=mnumber;
	}
	public void student()
	{
		System.out.println("hiii from method");
	}
}

