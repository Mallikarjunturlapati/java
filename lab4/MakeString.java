import java.util.Scanner;
class MakeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	String m,t;
	StringBuilder sb=new StringBuilder(2);
	System.out.print("Enter the main string: ");
	m = sc.nextLine();
	System.out.print("Enter the sub-string to be searched in the main string: ");
	t = sc.nextLine();
	int i = m.indexOf(t);
	if(i>= 0)
	{
	sb.append(m.charAt(i-1));
	sb.append(m.charAt(i+t.length()));
System.out.println("The characters just before and after of the given sub-string's first occurence is: " + sb);
}
	else
System.out.println("The given sub-string does not occur in the main string");
}
}
