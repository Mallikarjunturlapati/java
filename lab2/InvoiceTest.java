import java.io.*;
class Invoice
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String part_num;
	String part_des;
	int num_of_items;
	double price_of_items;
	double amount;
	
	//Constructor
	Invoice()
	{
		part_num="100";
		part_des="Charger";
		num_of_items=0;
		price_of_items=1000;
	}

	//Getters
	public String get_part_num() throws IOException
	{
		System.out.println("Enter the Part Number");
		part_num=br.readLine();
		return part_num;
	}
	public String get_part_des()throws IOException
	{
		System.out.println("Enter the Part Description ");
		part_des=br.readLine();
		return part_des;
	}
	public int get_num_of_items()throws IOException
	{
		System.out.println("Enter the Number of Items ");
		num_of_items=Integer.parseInt(br.readLine());
		return num_of_items;
	}
	public double get_price_of_items()throws IOException
	{
		System.out.println("Enter the Price of Items");
		price_of_items=Double.parseDouble(br.readLine());
		return price_of_items;
	}

	//Setters
	public String set_part_num(String num)
	{
		part_num=num;
		return part_num;
	}
	public String set_part_des(String des)
	{
		part_des=des;
		return part_des;
	}
	public int set_num_of_items(int numitem)
	{
		num_of_items=numitem;
		return num_of_items;
	}
	public double set_price_of_items(double price )
	{
		price_of_items=price;
		return price_of_items;
	}
	public double getInvoiceAmount()
	{
		amount = price_of_items*num_of_items;
		amount = (amount>0)?amount:0;
		return amount;
	}
	
	public void displayInfo()
	{
		System.out.print("Part Number\t\t" +part_num+
		"\nPart Description\t" +part_des+
		"\nNo.of Items\t\t"+num_of_items+
		"\nPrice of Items\t\t"+price_of_items);
		System.out.print("\nAmount\t\t\t"+amount);
		System.out.println();
	}
}

public class InvoiceTest
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Invoice inv1 = new Invoice();
		Invoice inv2 = new Invoice();
		inv1.get_part_num();
		inv1.get_part_des();
		inv1.get_num_of_items();
		inv1.get_price_of_items();
		inv1.getInvoiceAmount();
		System.out.println("-----------------------------");
		inv1.displayInfo();
	}
}