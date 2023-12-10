import java.util.*;
class Guess
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int attempt=5;
int same,sum;
int[] n={5,3,8,4,0};
for(int q=0;q<attempt;q++)
{
sum=0;
same=0;
int g=0;
System.out.print("User guess only 5 digits: ");
String z=sc.next();
while(z.length()!=5)
{	
System.out.println("Enter only 5 digits integer....");
System.out.print("User guess only 5 digits: ");
z=sc.next();
}
try
{
int p=Integer.parseInt(z);
int[] s=new int[5];
while(p>0)
{
int f=p%10;
s[s.length-g-1]=f;
g++;
p=p/10;
}				
for(int k=0;k<s.length;k++)
{
if (n[k]==s[k])
{
same+=1;
sum+=n[k];
}
}
if (same==5)
{
System.out.println("You have found the Secret code...    Congratulations!!!!!!");
return;
}
else if(q!=attempt-1)
{
System.out.println(same+" and "+sum);
System.out.println("Try again... ");
}
else
System.out.println("All attempts done...");
}
catch(NumberFormatException e)
{
System.out.println("enter valid integer...");
}
}
}
}
