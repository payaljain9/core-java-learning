import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement29 {
	public static void productmanagement29()
	{
		/*Product p[]=new Product[5];
		int productCount=0;*/
		ArrayList<Product> productlist=new ArrayList();
		while(true)
		{
			System.out.println("**************************PRODUCT MANAGEMENT************************");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Search Product");
			System.out.println("4.Display Product");
			System.out.println("5.Delete Product");
			System.out.println("6.Quit");
			System.out.print("what would you like to do today?");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				Product p1=new Product();
				System.out.println("-----------------------------ADD USER-----------------------");
				System.out.print("enter product name:");
				p1.productname=sc.nextLine();
				System.out.print("enter quantity:");
				p1.quantity=sc.nextInt();
				System.out.print("enter product price:");
				p1.price=sc.nextDouble();
				productlist.add(p1);
				/*p[productCount]=p1;
				productCount++;*/
				
			}
			else if(choice==2)
			{
				System.out.println("-----------------------------UPDATE PRODUCT------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==3)
			{
				System.out.println("-----------------------------SEARCH PRODUCT------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==4)
			{
				System.out.println("-----------------------------DISPLAY PRODUCT------------------------");
				for(Product data:productlist)
				{
					System.out.println("name:"+data.productname+"\nquantity:"+data.quantity+"\nprice:"+data.price);
				}
			}
			else if(choice==5)
			{
				System.out.println("-----------------------------DELETE PRODUCT------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==6)
			{
				return;
			}
			else
			{
				System.out.println("enter valid option...");
			}
		}

	}
}
