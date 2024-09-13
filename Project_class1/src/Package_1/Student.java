package Package_1;

public class Student 
{
int Rollno;
int age;
public void display1()
{
	//int Rollno;
	System.out.println("Print Display one");
}
public void display2()
{
	//int age;
	System.out.println("Print Display two");
}
public static void main(String[] args) 
{
	Student leo=new Student();
	leo.display1();
	leo.Rollno=121;
	System.out.println("print rollno" +leo.Rollno);
	leo.display2();
	leo.age=27;
	System.out.println("print age" + leo.age);
}
}
