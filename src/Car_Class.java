import  Package.Package_Class;
public class Car_Class {
	public static void main(String args[])
	{
		Package_Class p1=new Package_Class();
		p1.car_company="alto";
		p1.car_airbag="no";
		p1.car_price=524337;
		
		Package_Class p2=new Package_Class();
		p2.car_company="toyota";
		p2.car_airbag="yes";
		p2.car_price=5244337;
		
		System.out.println("company="+p1.car_company);
		System.out.println("airbag="+p1.car_airbag);
		System.out.println("price="+p1.car_price);
	
		System.out.println("\ncompany="+p2.car_company);
		System.out.println("airbag="+p2.car_airbag);
		System.out.println("price="+p2.car_price);
	}
}
