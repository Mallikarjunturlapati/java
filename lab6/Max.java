import java.util.Scanner;
class Max
{
public static int max(int a, int b)
{
return a > b ? a : b;
}
public static double max(double a, double b)
{
return a > b ? a : b;
}
public static double max(double a, double b, double c)
{
double m = max(a, b);
return m > c ? m : c;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i1, i2;
double d1, d2, d3;
System.out.println("Enter two integer values");
i1 = sc.nextInt();
i2 = sc.nextInt();
int maxInt = max(i1, i2);
System.out.println("Enter three double values");
d1 = sc.nextDouble();
d2 = sc.nextDouble();
d3 = sc.nextDouble();
double maxDou1 = max(d1, d2);
double maxDou2 = max(d1, d2, d3);
System.out.println("Max of two integers is "+maxInt);
System.out.println("Max of two doubles is "+maxDou1);
System.out.println("Max of three doubles is "+maxDou2);
}
}
