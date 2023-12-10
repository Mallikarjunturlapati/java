class Customer 
{
String bankName;
double depositAmount;
int noOfMonths;
public Customer(String bankName1, double depositAmount1, int noOfMonths1) 
{
bankName = bankName1;
depositAmount = depositAmount1;
noOfMonths = noOfMonths1;
}
public double calculateInterest(RBI bank) 
{
return bank.calculateInterest(depositAmount, noOfMonths);
}
}
class RBI 
{
public double calculateInterest(double depositAmount,int noOfmonth)
{
return 0.0;
}
}
class SBI extends RBI 
{
public double calculateInterest(double depositAmount,int noOfmonth)
{
double interestRate = 4.0;
return depositAmount * interestRate / 100 * noOfMonths + depositAmount;
}
}

class ICICI extends RBI 
{
public double calculateInterest(double depositAmount,int noOfmonth)
{
double interestRate = 3.5; // ICICI interest rate
return depositAmount * interestRate / 100 * noOfMonths + depositAmount;
}
}
public class Bank 
{
public static void main(String[] args) 
{
	 Scanner sc=new Scanner(System.in);
 System.out.print(“Enter bank name:”);
	 String bank=sc.next();
 System.out.print(“Enter deposit amount:”);
 double depo=sc.nextDouble();
	 System.out.print(“No.of months:”);
 int mon=sc.nextInt();
Customer customer1 = new Customer(bank,depo,mon);
RBI bank1 = new SBI();
System.out.println(customer1.calculateInterest(bank1));
}
}
