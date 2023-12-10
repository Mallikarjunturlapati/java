import java.util.Scanner;
class Customer
{
	int customernumber,qty;
	String customername;
	double price,discount,totalprice, netprice;
	void caldiscount()
	{
		totalprice = price * qty;
		if (totalprice>=50000)
			discount = totalprice*0.25;
		else if ((totalprice>=25000) && (totalprice<50000))
			discount = totalprice*0.15;
		else
			discount = totalprice*0.1;
			netprice= totalprice - discount;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		customername = sc.nextLine();
		System.out.print("Enter the customer number: ");
		customernumber = sc.nextInt();
		System.out.print("Enter the price: ");
		price = sc.nextDouble();
		System.out.print("Enter the quantity:");
		qty = sc.nextInt();
	}
	void show()
	{
		System.out.println("Customer name is " + customername);
		System.out.println("Customer number is " + customernumber);
		System.out.println("Total price is " + totalprice);
		System.out.println("Discount allotted is " + discount);
		System.out.println("Net price to be paid is " + netprice);
	}
}
class PriceCal
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
		c1.input();
		c1.caldiscount();
		System.out.println("-------------------------------");
		c1.show();
	}
}