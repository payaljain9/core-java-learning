package Jungle_Book_22_11;

public class Dog extends Animal{
	int nails;
	String breed;
	
	@Override
	public void drink()
	{
		System.out.println(name+" is lapping");
	}
	
	//Overload
	static void run()
	{
		System.out.println(" is running");
	}
	static void run(String alias)
	{
		System.out.println(alias+" is running");
	}
	static void run(String alias, int duration)
	{
		System.out.println(alias+ "is running since "+duration+" hours");
	}
	
	
	
	public void sleep()
	{
		System.out.println(name+" is sleeping");
	}
	public void hunt()
	{
		System.out.println(name+" is hunting");
	}
	public void bark()
	{
		System.out.println(name+" is barking");
	}
}
