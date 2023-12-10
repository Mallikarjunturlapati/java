import java.util.*;
class Rotate
{
public void Rotate(int arr[],int n,int index)
{
int j=0;
for(int i=0;i<index;i++)
{

int f;
f=arr[0];
for(j=0;j<n-1;j++)
{
arr[j]=arr[j+1];
}
arr[n-1]=f;
}
}
}
class leftrotate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NO OF ELEMENTS:");
int n=sc.nextInt();
System.out.println("ENTER ELEMENTS INTO ARRAy:");
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("ENTER HOW MANY TIMES TO ROTATE:");
int r=sc.nextInt();
System.out.println("ELEMENTS BEFORE ROTATION:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
Rotate ob=new Rotate();
ob.Rotate(arr,n,r);
System.out.println("ELEMENTS AFTER ROTATION:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}
