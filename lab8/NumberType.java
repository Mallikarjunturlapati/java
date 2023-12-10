import java.util.*;
interface Number
{
boolean isZero(int n);
boolean isNegative(int n);
boolean isPositive(int n);
boolean isOdd(int n);
boolean isEven(int n);
boolean isPrime(int n);
boolean isArmstrong(int n);
}
class Verification implements Number
{
public boolean isZero(int n) 
{
return n==0;
}
public boolean isNegative(int n) 
{
return n<0;
}
public boolean isPositive(int n) 
{
return n>0;
}
public boolean isOdd(int n) 
{
return n%2!=0;
}  
public boolean isEven(int n) 
{
return n%2==0;
}
public boolean isPrime(int n) 
{
int flag=0;
if(n==0||n==1)
{  
return false;   
} 
else
{  
for(int i=2;i<=n/2;i++)
{      
if(n%i==0)
{            
flag=1;      
break;      
}      
}
if(flag==0)  
{ 
return true;
}
return false;  
}
}
public boolean isArmstrong(int n) 
{
int r,sum=0,temp=n;
String s=Integer.toString(n);
int l=s.length();
while (n!= 0)
{
r = n % 10;
sum += Math.pow(r,l);
n /= 10;
}
return temp==sum;
}
}
class NumberType
{
public static void main(String[] args)
{
Verification obj=new Verification();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number ");
int n=sc.nextInt();
if(obj.isZero(n))
{
System.out.print("Zero ");
}
if(obj.isPositive(n))
{
System.out.print("Positive ");
}
if(obj.isNegative(n))
{
System.out.print("Negative ");
}
if(obj.isOdd(n))
{
System.out.print("Odd ");
}
if(obj.isEven(n))
{
System.out.print("Even ");
}
if(obj.isPrime(n) && obj.isPositive(n))
{
System.out.print("Prime ");
}
if(obj.isArmstrong(n) && obj.isPositive(n))
{
System.out.print("Armstrong ");
}
}
}
