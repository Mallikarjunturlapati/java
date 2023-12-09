import java.util.*;
class VendingMachine
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a,b,c,d;
a=b=c=d=0;
System.out.println("...VENDING MACHINE...\n"+"[1]GET GUM\n"+"[2]GET CHOCOLATE\n"+"[3]GET POPCORN\n"+"[4]GET GUICE\n"+"[5]DISPLAY ITEMS\n"+"[6]QUIT\n");
int ch;
do
{
System.out.print(">>>>>ENTER YOUR CHOICE:");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("HERE IS GUM");
a++;
break;
case 2:
System.out.println("HERE IS CHOCOLATE");
b++;
break;
case 3:
System.out.println("HERE IS POPCORN");
c++;
break;
case 4:
System.out.println("HERE IS JUICE");
d++;
break;
case 5:
System.out.println(">>ITEMS SOLD<<\n");
System.out.println(a+"ITEMS OF GUMS SOLD\n");
System.out.println(b+"ITEMS OF CHOCOLATES SOLD\n");
System.out.println(c+"ITEMS OF POPCORN SOLD\n");
System.out.println(d+"ITEMS OF JUICE SOLD\n");
break;
case 6:
System.out.println(">>EXITING<<");
break;
default:
System.out.println(">>CHOOSE CORRECT OPTION<<");
break;

}
}while(ch!=6);
}
}