import java.util.*;
class IMEI
{
public static boolean isValid(String imei)
{
if(imei.length() !=15)
{
return false;
}
List<Integer> d=new ArrayList<>();
for (int i=0;i<imei.length();i++)
{
d.add(Character.getNumericValue(imei.charAt(i)));
}
for(int i=d.size()-2;i>=0;i-=2)
{
int dd=d.get(i)*2;
d.set(i,dd>9?dd-9:dd);
}
int sum = d.stream().mapToInt(Integer::intValue).sum();
return sum%10==0;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE IMEI NUMBER:");
String imei=sc.nextLine();
boolean isValid=isValid(imei);
System.out.println("IS IMEI"+imei+"valid?"+isValid);

}
}