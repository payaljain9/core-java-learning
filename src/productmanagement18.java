import java.util.ArrayList;
import java.util.Scanner;

import Collection.Product;

public class productmanagement18 {
	public static void productmanagement18()
	{
		boolean f;
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> list=new ArrayList<>();
		while(true)
		{
			System.out.println("**************************PRODUCT MANAGEMENT************************");
			System.out.println("1.Add Product\n2.Update Product\n3.Delete Product\n4.Display Product\n5.Search Product\n6.Exit");
			System.out.println("what would you like to do:");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				Product product=new Product();
				System.out.print("Enter product name:");
				product.name=sc.nextLine();
				System.out.print("Enter product price:");
				product.price=sc.nextDouble();
				System.out.print("Enter product quantity:");
				product.quantity=sc.nextInt();
				list.add(product);
			}
			else if(choice==2)
			{
				f=false;
				System.out.println("**************************UPDATE PRODUCT************************");
				System.out.println("enter product to update");
				String pname=sc.nextLine();
				for(Product data:list)
				{
					if(data.name.equals(pname))
					{
						System.out.print("Enter new product price:");
						data.price=sc.nextDouble();
						System.out.print("Enter new product quantity:");
						data.quantity=sc.nextInt();
						System.out.println("product records updated successfully...");
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("product not available..!");
				}
			}
			else if(choice==3)
			{
				f=false;
				System.out.println("**************************DELETE PRODUCT************************");
				System.out.println("enter product to delete");
				String pname=sc.nextLine();
				for(Product data:list)
				{
					if(data.name.equals(pname))
					{
						list.remove(data);
						System.out.println("product records deleted successfully..!");
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("product not available..!");
				}
			}
			else if(choice==4)
			{
				System.out.println("**************************DISPLAY PRODUCT************************");
				if(list.size()==0)
				{
					System.out.println("products not available");
				}
				else
				{
					for(Product data:list)
					{
						System.out.println("Product name:"+data.name+"\tprice:"+data.price+"\tquantity:"+data.quantity);
					}
				}
			}
			else if(choice==5)
			{
				f=false;
				System.out.println("enter product to search");
				String pname=sc.nextLine();
				for(Product data:list)
				{
					if(data.name.equals(pname))
					{
						System.out.println("product records available...");
						System.out.println(data.name+" "+data.quantity+" "+data.price);
						f=true;
						break;
					}
				}
				if(f==false)
				{
					System.out.println("product not available..!");
				}
			}
			else if(choice==6)
			{
				return;
			}
			else
			{
				System.out.println("Invalid option...");
			}
		}
	}
}
