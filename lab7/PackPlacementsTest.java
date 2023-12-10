import placements.NoOfPlacements;
import java.util.Scanner;
class PackPlacementsTest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int noOfyrs,sum=0;
System.out.println("Enter no of years");
noOfyrs=sc.nextInt();
NoOfPlacements[] np=new NoOfPlacements[noOfyrs];
for(int i=0;i<np.length;i++) 
{
np[i]=new NoOfPlacements();
np[i].readData();
sum+=np[i].place;
}
System.out.println("Total number of placements "+sum);
}
}
