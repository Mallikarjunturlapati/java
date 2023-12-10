import java.util.*;
class Book
{
String name, author;
public void setdata(String n, String a)
{
name = n;
author = a;
}
public void display()
{
System.out.println("Book name: "+name);
System.out.println("Author name: "+author);
}
}
class Mcgrawhill extends Book
{
int price;
public void price(int p)
{
this.price = p;
}
public void display()
{
System.out.println("Mcgraw Hill price is "+price);
}
}
class Oxford extends Book
{
int price;
public void price(int p)
{
this.price = p;
}
public void display()
{
System.out.println("Oxford price is "+price);
}
}
class BookDetails
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Book ob = new Book();
Mcgrawhill ob1 = new Mcgrawhill();
Oxford ob2 = new Oxford();
System.out.println("Enter book name");
String n = sc.nextLine();
System.out.println("Enter author name");
String a = sc.nextLine();
System.out.print("Enter Mcgraw hill price ");
int mp = sc.nextInt();
System.out.print("Enter Oxford price ");
int op = sc.nextInt();
System.out.println("Book Details");
ob.setdata(n,a);
ob.display();
ob1.price(mp);
ob1.display();
ob2.price(op);
ob2.display();
}
}
