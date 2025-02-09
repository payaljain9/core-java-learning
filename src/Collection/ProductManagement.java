package Collection;
import java.util.*;
public class ProductManagement {
	public static void productmanagement()
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> list=new ArrayList();
		while(true)
		{
			System.out.println("**************************PRODUCT MANAGEMENT************************");
			System.out.println("1.Add Product\n2.Update Product\n3.Delete Product\n4.Display Product\n5.Exit");
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
				System.out.println("to be updated soon....");
			}
			else if(choice==3)
			{
				System.out.println("to be updated soon....");
			}
			else if(choice==4)
			{
				System.out.println("**************************DISPLAY PRODUCT************************");
				for(Product data:list)
				{
					System.out.println("Product name:"+data.name+"\tprice:"+data.price+"\tquantity:"+data.quantity);
				}
			}
			else if(choice==5)
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
