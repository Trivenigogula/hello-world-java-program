import java.util.Scanner;
class test {
int id;
String name;
double salary;

void output()
{
System.out.println(name);
System.out.println(id);
System.out.println(salary);
}
void input()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter a name");
name=ob.nextLine();
System.out.println("enter a salary");
salary=ob.nextDouble();
System.out.println("enter a id");
id=ob.nextInt();
}
}
class employee {
public static void main(String[] args) {
test ob=new test();
ob.input();
ob.output();

}
}

