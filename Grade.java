import java.util.*;
class Stat
{
public double mean(double arr[],int n)
{
double total=0;
for(int i=0;i<n;i++)
{
total+=arr[i];
}
return total/n;
}
public double sd(double arr[],int n)
{
double m=mean(arr,n);
double var=0;
for (int i=0;i<n;i++)
{
var+=(arr[i]-m)*(arr[i]-m);
}
return Math.sqrt(var);
}
int s[]=new int[10];
public void freq(double arr[],int n)
{
for (int i=0;i<n;i++)
{
if(arr[i]>=0 && arr[i]<=9)
s[0]++;
if(arr[i]>=10 && arr[i]<=19)
s[01]++;
if(arr[i]>=20 && arr[i]<=29)
s[2]++;
if(arr[i]>=30 && arr[i]<=39)
s[3]++;
if(arr[i]>=40 && arr[i]<=49)
s[4]++;
if(arr[i]>=50 && arr[i]<=59)
s[5]++;
if(arr[i]>=60 && arr[i]<=69)
s[6]++;
if(arr[i]>=70 && arr[i]<=79)
s[7]++;
if(arr[i]>=80 && arr[i]<=89)
s[8]++;
if(arr[i]>=90 && arr[i]<=100)
s[9]++;
}
}
}
class Grade
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Stat ob=new Stat();
System.out.println("ENTER NUMBER OF STUDENTS:");
int n=sc.nextInt();
double g[]=new double[n];
for(int i=0;i<n;i++)
{
System.out.println("ENTER MARKS OF STUDENT "+(i+1));
g[i]=sc.nextDouble();
}
double mean=ob.mean(g,n);
double sd=ob.sd(g,n);
System.out.println("MEAN:"+mean);
System.out.println("STANDARD  DEVIATION:"+sd);
ob.freq(g,n);
System.out.println("<<<FREQUENCY:>>>");
for(int i=0;i<10;i++)
{
System.out.println("THE PERCENT OF STUDENTS FROM "+(i*10)+"to"+(i*10+9)+"is"+(ob.s[i]*100/n));
}

}
}