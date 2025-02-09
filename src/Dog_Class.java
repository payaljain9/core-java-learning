import Package.Package_Class;

public class Dog_Class {
	public static void main(String args[])
	{
		Package_Class p1=new Package_Class();
		p1.dog_breed="Siamese";
		p1.dog_age=5;
		
		Package_Class p2=new Package_Class();
		p2.dog_breed="Persian";
		p2.dog_age=2;
		
		System.out.println("breed="+p1.dog_breed);
		System.out.println("age="+p1.dog_age);
		System.out.println("\nbreed="+p2.dog_breed);
		System.out.println("age="+p2.dog_age);
	}
}
