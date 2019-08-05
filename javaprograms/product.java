 class Student{
protected int a=20;
protected void pull() {
System.out.println("hello java");
}
}
 class option {
public static void main(String args[])
{
Student obj=new Student();
System.out.println(obj.a);
obj.pull();

}
}