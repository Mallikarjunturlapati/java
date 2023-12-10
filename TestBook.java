import java.util.*;
class Book
{
String bookname;
int ISBN;
String author;
String publisher;
Scanner sc=new Scanner(System.in);
Book()
{
bookname="JAVA";
ISBN=1000;
author="PAUL";
publisher="PROGRAMING HALL";
}
//GETTERS
public void getbookname()
{
System.out.println("ENTER BOOK NAME:");
bookname=sc.nextLine();
}
public void getISBN()
{
System.out.println("ENTER ISBN NUMBER:");
ISBN=sc.nextInt();
}
public void getauthor()
{
System.out.println("ENTER THE AUTHOR NAME:");
author=sc.next();
}
public void getpublisher()
{
System.out.println("ENTER PUBLISHER:");
publisher=sc.next();
}
//SETTERS
public void setbookname(String name)
{
this.bookname=name;
}
public void setISBN(int isbn)
{
this.ISBN=isbn;
}
public void setauthor(String author)
{
this.author=author;
}
public void setpublisher(String publisher)
{
this.publisher=publisher;
}
public void getBookInfo()
{
System.out.println("\nBOOK NAME:"+bookname);
System.out.println("\nISBN NUMBER:"+ISBN);
System.out.println("\nAUTHOR NAME:"+author);
System.out.println("\nPUBLISHER NAME:"+publisher);
}
}
class TestBook
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Book[] book=new Book[30];
int i=0;
System.out.println("ENTER HOW MANY BOOKS DO YOU WANT TO STORE?");
int n=sc.nextInt();
System.out.println("DO YOU WANT VALUES BY GET METHOD OR SET METHOD"+"\n[1]GET METHOD"+"\n[2]SET METHOD");
int ch=sc.nextInt();
try
{
if(ch==1)
{
for(i=0;i<n;i++)
{
System.out.printf("\n ENTER %d BOOK DETAILS:\n",i+1);
book[i]=new Book();
book[i].getbookname();
book[i].getISBN();
book[i].getauthor();
book[i].getpublisher();
}
}
else
{
book[i]=new Book();
book[i].setbookname("JAVA");
book[i].setISBN(100);
book[i].setauthor("PAUL");
book[i].setpublisher("PROGRAMMING HALL");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
for(i=0;i<n;i++)
{
book[i].getBookInfo();
System.out.println();
}
}
}