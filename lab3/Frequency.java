import java.util.*;
public class Frequency 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of elements into array ");
int n=sc.nextInt();
int[] arr=new int[n];
int[] count=new int[n];
int visited=-1;
System.out.println("Enter elements into array");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++) 
{
int cnt=1;
for (int j=i+1;j<n;j++) 
{
if(arr[i]==arr[j]) 
{
cnt++;
count[j]=visited;
}
}
if (count[i]!=visited) 
{
count[i]=cnt;
}
}
System.out.println("Element  Frequency");
for (int i=0;i<n;i++) 
{
if(count[i]!=visited) 
{
System.out.println(arr[i] + " frequency is " + count[i]);
}
}
}
}
