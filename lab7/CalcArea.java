import shape.*;
import java.util.Scanner;
class CalcArea
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int w,h;
System.out.print("Enter width ");
w=sc.nextInt();
System.out.print("Enter height ");
h=sc.nextInt();
Triangle t=new Triangle(w,h);
Rectangle r=new Rectangle(w,h);
Square s=new Square(w,h);
t.Area();
r.Area();
s.Area();
}
}
