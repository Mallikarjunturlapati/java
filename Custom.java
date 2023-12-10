import java.util.*;
class Customer
{
int customernumber,qty;
String customername;
double price,discount,totalprice,netprice;
void init()
{
customernumber=101;
customername="AJAY";
qty=0;
price=discount=netprice=0;
}
public void Calldiscount()
{
totalprice=price*qty;
if(totalprice>=50000)
{
discount=totalprice*0.25;
}
else if(totalprice<50000&&totalprice>=25000)
{
discount=totalprice*0.15;
}
else
{
discount=totalprice*0.10;
}
netprice=totalprice-discount;
}
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER CUSTOMER NUMBER:");
customernumber=sc.nextInt();
System.out.println("ENTER CUSTOMER NAME:");
customername=sc.next();
System.out.println("ENTER QUANTITY:");
qty=sc.nextInt();
System.out.println("ENTER PRICE:");
price=sc.nextInt();
Calldiscount();
}
void show()
{
System.out.println(">>>CUSTOMER DETAILS<<<");
System.out.println("CUSTOMER NAME:"+customername);
System.out.println("CUSTOMER NUMBER:"+customernumber);
System.out.println("NET PRICE:"+netprice);
}
}
class Custom
{
public static void main(String[] args)
{
Customer c=new Customer();
c.input();
c.show();
}
}