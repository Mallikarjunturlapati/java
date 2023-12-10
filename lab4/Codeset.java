import java.util.*;
class Agent
{
Scanner sc=new Scanner(System.in);
int validlen(String s)
{
int n=s.length(),count=0;
for(int i=6;i<n-1;i++)
{
count++;
}
if(count>6)
{
return 0;
}
else
{
return 1;
}
}
void recheck(String s)
{
String n=new String();
System.out.println(“Please re confirm the code:”);
n=sc.nextLine();
if(s.equals(n))
{
System.out.println(“CODE NAME CONFIRMED”);
}
else
{
System.out.println(“CODE NAME MISMATCH”);
}
}
void validity(String s)
{
if!((s.charAt(s.length()-1)==’x’))
{
System.out.println(“Code name not ended with x”);
}
String a=”Agent “;
if(!(s.contains(a))
{
System.out.println(“Code name must start with agent”);
}
}
}
class Codeset
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=new String();
s=sc.nextLine();
Agent a=new Agent();
while(a.validlen(s)!=0)
{
System.out.println(“INVALID CODENAME”);
System.out.println(“Re enter code:”);
s=sc.nextLine();
a.validlen(s);
}
a.validity(s);
a.recheck(s);
}
}
