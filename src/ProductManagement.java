import java.util.*;
public class ProductManagement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                              ADD PRODUCT                              ");
		System.out.print("Enter Product Name:");
		String pname=sc.nextLine();
		System.out.print("Enter Product Quantity:");
		int pquantity=sc.nextInt();
		System.out.print("Enter Product Price:");
		double pprice=sc.nextDouble();
		System.out.println("-------------------------------Product Details-------------------------------------");
		System.out.println("Product Name="+pname+"\nProduct Quantity="+pquantity+"\nProduct Price="+pprice);
	}
}
