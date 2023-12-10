class Student 
{
String name;
int age;
String address;
Student() 
{
name = "unknown";
age = 0;
address = "not available";
}
void setInfo(String name1, int age1) 
{
name = name1;
age = age1;
}
void setInfo(String name1, int age1, String address1) 
{
name = name1;
age = age1;
address = address1;
}
}
public class Array 
{
public static void main(String[] args) 
{
Student[] students1 = new Student[3];
students1[0] = new Student();
students1[1] = new Student();
students1[2] = new Student();
students1[0].setInfo("john", 10, "Vijayawada");
students1[1].setInfo("San", 20, "Guntur");
students1[2].setInfo("Ram", 30, "Hyderabad");

for (int i = 0; i < students1.length; i++) 
{
System.out.println("Student"+(i+1)+" name="+students1[i].name);
System.out.println("Student"+(i+1)+" age="+students1[i].age);
System.out.println("Student"+(i+1)+"address="+students1[i].address);
}
}
}
