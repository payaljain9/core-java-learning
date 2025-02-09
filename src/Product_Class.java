import  Package.Package_Class;
public class Product_Class {
	public static void main(String args[])
	{
		Package_Class p1=new Package_Class();
		p1.product_name="rice";
		p1.product_price=500;
		
		Package_Class p2=new Package_Class();
		p1.product_name="Educational_things";
		p1.product_price=5000;
		
		System.out.println("product name="+p1.product_name);
		System.out.println("product price="+p1.product_price);
		System.out.println("\nproduct name="+p1.product_name);
		System.out.println("product price="+p1.product_price);
	}
}
