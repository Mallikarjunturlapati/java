import java.util.*;
class Vending
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int key,c_1,c_2,c_3,c_4;
c_1=c_2=c_3=c_4=0;
System.out.println("Your choices are:\n[1] Get gum\n[2]Get chocolate\n[3] Get popcorn\n[4] Get juice\n[5] Display total sold so far\n[6] Quit");
do
{
System.out.print("Enter the key: ");
	key=a.nextInt();
	switch (key)
	{
case 1:
{
System.out.println("Here's your Gum!");
c_1++;
break;
}  
case 2:
{
System.out.println("Here's your Chocolate!");
c_2++;
break;
}
case 3:
{
System.out.println("Here's your Popcorn!");
c_3++;
break;
}
case 4:
{
System.out.println("Here's your Juice!");
c_4++;
break;
}
case 5:
{
System.out.println(c_1+"items of gum sold");
System.out.println(c_2+"items chocolate sold");
System.out.println(c_3+"items of popcorn sold");
System.out.println(c_4+"items of juice sold");
break;
}
case 6:
{
System.out.println("Ending the program...");
break;
}
default:
{
System.out.println("Error,optons 1-6 only!!");
break;
}
}
}
while(key!=6);
}
}
