package Constructor_24_11;

public class College_Main {
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student("anuja","patil","5456755232");
		
		System.out.println(s1.fname);
		System.out.println(s1.lname);
		System.out.println(s1.mnumber);
		System.out.println("--------------------");
		System.out.println(s2.fname);
		System.out.println(s2.lname);
		System.out.println(s2.mnumber);
	}
}
