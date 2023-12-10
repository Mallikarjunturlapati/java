import java.util.*;
class IPLcricket
{
int win,loss,total;
IPLcricket(int t,int w,int l)
{
total=t;
win=w;
loss=l;
}
public void total()
{
System.out.println("Played Matches="+total);
}
public void win()
{
System.out.println("Win="+win);
}
public void loss()
{
System.out.println("Loss="+loss);
}
}
class Chennai_superkings extends IPLcricket
{
Chennai_superkings(int a,int b,int c)
{
super(a,b,c);
}
public void display()
{
System.out.println("Chennai_superkingsTeam summary:");
if(this.win+this.loss==this.total)
{
super.total();
super.win();
super.loss();
}
else
{
System.out.println("Invalid win and loss data");
}
}
}
class Hyderabad_sunrises extends IPLcricket
{
Hyderabad_sunrises(int a,int b,int c)
{
super(a,b,c);
}
public void display()
{
System.out.println("Hyderabad_sunrisesTeam summary:");
if(this.win+this.loss==this.total)
{
super.total();
super.win();
super.loss();
}
else
{
System.out.println("Invalid win and loss data");
}
}
}
class IplTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t1=sc.nextInt();
int w1=sc.nextInt();
int l1=sc.nextInt();
int t2=sc.nextInt();
int w2=sc.nextInt();
int l2=sc.nextInt();
Hyderabad_sunrises ob1=new Hyderabad_sunrises(t1, w1, l1);
ob1.display();
Chennai_superkings ob2=new Chennai_superkings(t2, w2, l2);
ob2.display();
}
}
