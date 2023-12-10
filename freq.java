import java.util.*;
class freq
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY:");
int n=sc.nextInt();
int[] arr=new int[n];
int[] count=new int[n];
int v=-1;
System.out.println("ENTER THE ELEMENTS IN THE ARRAY:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
int cnt=1;
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
cnt++;
count[j]=v;
}
}
if(count[i]!=v)
{
count[i]=cnt;
}
}
System.out.println("ELEMENT FREQUENCY:");
for(int i=0;i<n;i++)
{
if(count[i]!=v)
{
System.out.println(arr[i]+" FREQUENCY IS "+count[i]);
}
}
}
}