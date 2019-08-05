 class Student{
private int a;
Student()
{
a=10;
}
int display()
{
return a;
}
}

 class option {
public static void main(String args[])
{
Student obj=new Student();
System.out.println(obj.display());
}
}

