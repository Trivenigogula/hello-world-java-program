class test 
{
int a;
test()
{
System.out.println(a);
}
void display(int a)
{
System.out.println(a);
}
}
class test_po
{
public static void main(String[] args) {
test ob=new test();
ob.display(10);
}
}