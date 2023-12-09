import java.util.*;
class MealCost{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
double MealCost;
int tipPercent,taxPercent;
System.out.println("ENTER THE MEALCOST:");
MealCost=sc.nextDouble();
System.out.println("ENTER TIP PERCENT:");
tipPercent=sc.nextInt();
System.out.println("ENTER TAX PERCENT:");
taxPercent=sc.nextInt();
double tip=MealCost*tipPercent*0.01;
double tax=MealCost*taxPercent*0.01;
double t=MealCost+tax+tip;
int total=(int)t;

System.out.println("THE TOTAL MEAL COST IS:"+total);
}
}