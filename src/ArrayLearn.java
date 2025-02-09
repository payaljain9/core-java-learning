
public class ArrayLearn {
	public static void main(String args[])
	{
		// primitive type-declaration initialization
		int a[]= {54,67,34,7,34,7};
		
		//primitive type-declaration
		int b[]=new int[5];
		//initialization
		b[0]=65;
		b[1]=23;
		b[2]=78;
		b[3]=876;
		b[4]=78;
		
		//user defined 
		Student s[]=new Student[500];   //declaration
		s[0]=new Student();             //creation of student data structure
		s[0].fname="payal";             //initialization
		s[0].lname="jain";
		s[0].age=21;
		
	}
}
