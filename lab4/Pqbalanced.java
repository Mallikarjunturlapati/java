import java.util.*;
class Pqbalanced
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);
System.out.print ("Enter the string ");
String s = sc.next ();
boolean ans = false;
for (int i = 0; i < s.length (); i++)
{
	char ch = s.charAt(i);
	if (ch == 'p')
	{
	ans = false;
	}
	else if (ch == 'q')
	ans = true;
}
System.out.println ("The string is pqbalanced? " + ans);
}
}
