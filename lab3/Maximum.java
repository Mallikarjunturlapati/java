import java.util.*;
public class Maximum
{
public static int maxInRange(int[] arr, int lowIndex, int highIndex) 
{
if(lowIndex==highIndex) 
{
return arr[lowIndex];
}
int midIndex=(lowIndex + highIndex) / 2;
return Math.max(maxInRange(arr, lowIndex, midIndex),maxInRange(arr, midIndex + 1, highIndex));
}

public static int max(int[] arr) 
{
return maxInRange(arr, 0, arr.length - 1);
}

public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of elements in array ");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements into array");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
} 
int maxEle=max(arr);
System.out.println("The maximum element is: " + maxEle);
}
}
