package class_object;

public class CollegeMain {
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.firstName="Payal";
		s1.lastName="Jain";
		s1.age=21;
		s1.branchName="MCA";
		s1.mobile="9067560134";
		s1.diplayFullName();
		s1.diplayAge();
		s1.diplayMobile();
		String stdMobile1=s1.displayMobileWithSTD("91");
		System.out.println(stdMobile1);
		s1.displayBranchName();
		
		System.out.println();
		
		Student s2=new Student();
		s2.firstName="Mitali";
		s2.lastName="Jain";
		s2.age=23;
		s2.branchName="M Com";
		s2.mobile="9746260134";
		s2.diplayFullName();
		s2.diplayAge();
		s2.diplayMobile();
		String stdMobile2=s1.displayMobileWithSTD("91");
		System.out.println(stdMobile2);
		s2.displayMobileWithSTD("91");
		s2.displayBranchName();
	}
}
