import java.util.*;
class Password
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print(“No.of passwords u want to enter:”);
int n;
n=sc.nextInt();
String s=new String[n];
for(int i=0;i<n;i++)
{
System.out.println(“Enter input “+(i+1)+”:”);
s[i]=sc.next();
}
System.out.println(“Correct passwords are:”);

for(int i=0;i<n;i++)
{
int c1,c2,c3,c4;
c1=c2=c3=c4=0;
if(s[i].length()>6 && s[i].length()<12)
{

for(int j=0;j<s[i].length();j++)
{
char ch=s[i].charAt(j);
if(ch>=97 &&ch<=122)
{
c1++;
}
if(ch>=65 && ch<=90)
{
c2++;
}
if(ch>=48 && ch<=57)
{
c3++;
}
if(ch==’$’ || ch==’#’ || ch==’@’)
{
c4++;
}
}
if(c1>=1 && c2>==1 && c3>=1 && c4>=1)
{
System.out.println(s[i]);
}
}
}
}

