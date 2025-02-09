import Package.Package_Class;

public class Classroom_Class {
	public static void main(String args[])
	{
		Package_Class p1=new Package_Class();
		p1.classroom_number=101;
		p1.classromm_capacity=50;
		
		Package_Class p2=new Package_Class();
		p1.classroom_number=106;
		p1.classromm_capacity=40;
		
		System.out.println("classroom number="+p1.classroom_number);
		System.out.println("classroom capacity="+p1.classromm_capacity);
		System.out.println("\nclassroom number="+p2.classroom_number);
		System.out.println("classroom capacity="+p2.classromm_capacity);
	}
}
