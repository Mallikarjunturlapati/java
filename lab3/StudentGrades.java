import java.util.*;
class Statistics
{
public double Mean(double arr[],int n)
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
double m=Mean(arr,n);
double variance=0;
for(int i=0;i<n;i++)
{
variance+=(arr[i]-m)*(arr[i]-m);
  }
variance=variance/n;
return Math.sqrt(variance);
}
int stat[]=new int[10];
public void freq(double arr[],int n)
{
for(int i=0;i<n;i++)
{
if(arr[i]>=0 && arr[i]<=9)
stat[0]++;
if(arr[i]>=10 && arr[i]<=19)
stat[1]++;
if(arr[i]>=20 && arr[i]<=29)
stat[2]++;
if(arr[i]>=30 && arr[i]<=39)
stat[3]++;
if(arr[i]>=40 && arr[i]<=49)
stat[4]++;
if(arr[i]>=50 && arr[i]<=59)
stat[5]++;
if(arr[i]>=60 && arr[i]<=69)
stat[6]++;
if(arr[i]>=70 && arr[i]<=79)
stat[7]++;
if(arr[i]>=80 && arr[i]<=89)
stat[8]++;
if(arr[i]>=90 && arr[i]<=100)
stat[9]++;
}
}
}
class StudentGrades
{
public static void main (String[] args) 
{
Scanner sc=new Scanner(System.in);
Statistics obj=new Statistics();
System.out.print("Enter the number of students ");
int n=sc.nextInt();
double grades[]=new double[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the marks of student "+(i+1));
grades[i]=sc.nextDouble();
}
double mean=obj.Mean(grades,n);
System.out.println("The mean of the student marks is "+mean);
double standarddev=obj.sd(grades,n);
System.out.println("The standard deviation of the student marks is "+standarddev);
obj.freq(grades,n);
System.out.println("Students frequency distribution");
for(int i=0;i<10;i++)
{
System.out.println("Percent of students in range of "+(i*10)+" to "+(i*10+9)+" is "+(obj.stat[i]*100)/n);
}
}
}
