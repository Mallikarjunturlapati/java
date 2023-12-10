import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
class fileThread extends Thread
{
private String filename;
public fileThread(String filename)
{
this.filename=filename;
}
public void run()
{
try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
{
String line;
while((line=reader.readLine())!=null)
{
synchronized(System.out)
{
System.out.println(Thread.currentThread().getName()+":"+line);
}
Thread.sleep(1000);
}
}
catch(IOException | InterruptedException e)
{
e.printStackTrace();
}
}
public static void main(String[] args)
{
fileThread thread1=new fileThread("PERSONALRECORD.txt");
fileThread thread2=new fileThread("ACADEMICRECORD.txt");
thread1.start();
thread2.start();
}
}