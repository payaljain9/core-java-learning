import java.util.Scanner;
public class ProductManagement30 {
	public static void productmanagement30()
	{
		product3 p[]=new product3[5];
		int productCount=0;
		while(true)
		{
			System.out.println("**************************PRODUCT MANAGEMENT************************");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Search Product");
			System.out.println("4.Delete Product");
			System.out.println("5.Display Product");
			System.out.println("6.Quit");
			System.out.print("what would you like to do today?");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				product3 p1=new product3();
				System.out.println("-----------------------------ADD USER-----------------------");
				System.out.print("enter product name:");
				p1.productname=sc.nextLine();
				System.out.print("enter quantity:");
				p1.quantity=sc.nextInt();
				System.out.print("enter product price:");
				p1.price=sc.nextDouble();
				p[productCount]=p1;
				productCount++;	
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
				System.out.println("-----------------------------DELETE PRODUCT------------------------");
				System.out.println("to be updated soon....");
			}
			else if(choice==5)
			{
				System.out.println("-----------------------------DISPLAY PRODUCT------------------------");
				for(int i=0; i<productCount;i++)
				{
					System.out.println();
					System.out.println("product name:"+p[productCount].productname);
					System.out.println("quantity:"+p[productCount].quantity);
					System.out.println("product price:"+p[productCount].price);
				}
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
