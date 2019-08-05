class test 
{
int a;
test()
{
a=100;
System.out.println(a);
}
void display(int a)
{
this.a=a;
System.out.println(a);
}
}
class test_poo
{
public static void main(String[] args) {
test ob=new test();
ob.display(10);
}
}