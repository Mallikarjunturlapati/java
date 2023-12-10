import java.util.*;
class Automobile
{
String make;
String Year_Model;
double milage;
double price;
Automobile(String m,String y,double mge,double p)
{
make=m;
Year_Model=y;
milage=mge;
price=p;
}
public String toString()
	return "make: "+make+"\n"+"Year model: "+Year_Model+"\n"+"milage: "+milage+"\n"+"price: "+price;
}
class car extends Automobile
{
car(String m,String y,double mge,double p)
super(m,y,mge,p);
}
class truck extends Automobile
{
truck(String m,String y,double mge,double p)
super(m,y,mge,p);
}
class van extends Automobile
{
van(String m,String y,double mge,double p)
super(m,y,mge,p);
}
class Vehicle
{
public static void main(String[] args)
{	
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1.car 2.truck 3.van: ");
int choice=sc.nextInt();
System.out.println("enter make: ");
String m=sc.next();
System.out.println("enter Year/model");
String y=sc.next();
System.out.println("enter milage: ");
double mge=sc.nextDouble();
System.out.println("enter price: ");
double p=sc.nextDouble();
int k=Integer.parseInt(y.substring(0,4));
if(k<=2000 || k>=2030)
{
System.out.println("Invalid year/model..");
return;
}
switch(choice)
{
case 1:
	car c=new car(m,y,mge,p);
	System.out.println(c);
	break;
case 2:
	truck t=new truck(m,y,mge,p);
	System.out.println(t);
	break;
case 3:
	van v=new van(m,y,mge,p);
	System.out.println(v);
	break;
}	
}
