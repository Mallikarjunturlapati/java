import java.util.Scanner;
interface Employee
{
void ReadData();
void DisplayData();
}
class UserSelection implements Employee
{
Scanner sc=new Scanner(System.in);
String name;
int empid,salary;
public void ReadData() 
{
System.out.print("Enter employee name ");
name=sc.next();
System.out.print("Enter employee id ");
empid=sc.nextInt();
System.out.print("Enter salary ");
salary=sc.nextInt();
System.out.println();
}
public void DisplayData() 
{
System.out.println("Employee name="+name);
System.out.println("Employee id="+empid);
System.out.println("Employee salary="+salary);
System.out.println();
}
}
class EmployeeTest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
UserSelection obj=new UserSelection();
int choice;
System.out.println("1.Read Data\n2.Display data\n3.Exit");
while(true)
{
System.out.print("Enter ur choice ");
choice=sc.nextInt();
switch (choice) 
{
case 1:
obj.ReadData();
break;
case 2:
obj.DisplayData();
break;
case 3:
System.out.println("Exiting....");
System.exit(0);
break;
}
}    
}
}
