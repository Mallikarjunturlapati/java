import java.util.*;
class Meal
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the details:");
double mealCost=a.nextDouble();
int tipPercent=a.nextInt();
int taxPercent=a.nextInt();
double tip=mealCost*tipPercent*0.01;
double tax=mealCost*taxPercent*0.01;
double total=mealCost+tip+tax;
int total1=(int)total;
System.out.println("total cost of the meais:"+total1);
}
}
