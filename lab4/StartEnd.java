import java.util.*;
class StartEnd
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print ("Enter the string ");
String s = sc.next();
if(s.startsWith(s.substring(0,2))&&s.endsWith(s.substring(0, 2)))
{
System.out.println (s.substring (2, s.length ()));
}
else
{
System.out.println(s);
}
}
}
