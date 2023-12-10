import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class HighClass
{
public static void main(String[] args)
{try
{
File file=new File("Scores.txt");
if(!file.exists())
{
throw new FileNotFoundException("FileNotFoundException:Not Found");
}
Scanner sc=new Scanner(file);
int hs=Integer.MIN_VALUE;
while(sc.hasNextInt())
{
int s=sc.nextInt();
if(s>hs)
{
hs=s;
}
}
if(hs!=Integer.MIN_VALUE)
{

System.out.println("HIGHSCORE"+hs);
}
else
{
System.out.println("HIGHSCORE NOT FOUND");

}
}
catch(FileNotFoundException e)
{
System.out.println(e.getMessage());
}
}
}
