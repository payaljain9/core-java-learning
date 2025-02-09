import Package.Package_Class;

public class Cat_Class {
	public static void main(String args[])
	{
		Package_Class p1=new Package_Class();
		p1.cat_breed="Siamese";
		p1.cat_age=5;
		
		Package_Class p2=new Package_Class();
		p2.cat_breed="Persian";
		p2.cat_age=2;
		
		System.out.println("breed="+p1.cat_breed);
		System.out.println("age="+p1.cat_age);
		System.out.println("\nbreed="+p2.cat_breed);
		System.out.println("age="+p2.cat_age);
	}
}
