import java.util.*;
class Rotate
{
public void rotate(int arr[],int n,int pivot)
{
int j=0;
for(int i=0;i<pivot;i++)
{
int k=arr[0];
for(j=0;j<n-1;j++)
{
arr[j]=arr[j+1];
}
arr[n-1]=k;
}
}
}
class RotateTest
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
Rotate obj=new Rotate();
System.out.print("Enter no of elements in array ");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements into array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter the index to left rotate");
int index=sc.nextInt();
obj.rotate(arr,n,index);
System.out.println("Array after left rotating");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}
