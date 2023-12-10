import java.util.*;
class Invoice
{
String PartNumber,PartDescription;
int Quantity;
double price;
double Amount;
Scanner sc=new Scanner(System.in);
Invoice()//constructor
{
PartNumber="100";
PartDescription="MOUSE";
Quantity=2;
price=400;
}
//getters
public String getPartNumber()
{
System.out.println("ENTER PART NUMBER:");
PartNumber=sc.nextLine();
return PartNumber;
}
public String getPartDescription()
{
System.out.println("ENTER PART DESCRIPTION:");
PartDescription=sc.nextLine();
return PartDescription;
}
public int getQuantity()
{
System.out.println("No OF ITEMS PURCHASED:");
Quantity=sc.nextInt();
return Quantity;
}
public double getprice()
{
System.out.println("ENTER PRICE:");
price=sc.nextInt();
return price;
}
//SETTERS
public String setPartNumber(String num)
{
PartNumber=num;
return PartNumber;
}
public String setPartDescription(String des)
{
PartDescription=des;
return PartDescription;
}
public int setQuantity(int quan)
{
Quantity=quan;
return Quantity;
}
public double setprice(int price)
{
price=price;
return price;
}
public double getAmount()
{
Amount=price*Quantity;
Amount=(Amount>0)?Amount:0;
return Amount;
}
}
public class InvoiceText
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Invoice inv=new Invoice();
inv.getPartNumber();
inv.getPartDescription();
inv.getQuantity();
inv.getprice();
inv.getAmount();
System.out.println(">>>DESCRIPTION<<<\n"+"PART NUMBER:\t\t"+inv.PartNumber+"\nPART DESCRIPTION\t"+inv.PartDescription+"\nQUANTITY\t\t"+inv.Quantity+"\nprice\t\t\t"+inv.price+"\nAmount\t\t\t"+inv.Amount);
System.out.println();
}
}
