import java.util.*;
import java.util.function.IntPredicate;
class lambda
{
public static IntPredicate isOdd()
{
return n-> (n%2!=0);
}
public static IntPredicate isprime()
{
return n-> {
if(n<2)
{
return false;}
for(int i=2;i<Math.sqrt(n);i++)
{
if(n%i==0)
{
return false;
}
}
return true;
};
}
public static IntPredicate ispailndrome()
{
return n->{
int r=0;
int o=n;
while(n!=0)
{
int d=n%10;
r=r*10+d;
n=n/10;
}
return o==r;
};
}


public static void main(String[] args)
{
int t,u,v,w,x;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
u=sc.nextInt();
v=sc.nextInt();
w=sc.nextInt();
x=sc.nextInt();
System.out.println(isOdd().test(t) ? "ODD":"EVEN");
System.out.println(isOdd().test(u) ? "PRIME":"COMPOSITE");
System.out.println(isOdd().test(v) ? "PALINDROME":"NOT PALINDROME");
System.out.println(isOdd().test(w) ? "ODD":"EVEN");
System.out.println(isOdd().test(x) ? "PRIME":"COMPOSITE");

}
}
