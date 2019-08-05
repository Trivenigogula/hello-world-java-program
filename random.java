import java.util.*;
class random {
public static void main(String[]args) {
double t=Math.random();
System.out.println(t);
Random obj=new Random(10);
int u=obj.nextInt(100);
System.out.println(u);
float f=obj.nextFloat();
System.out.println(f);
double d=obj.nextDouble();
System.out.println(d);


}
}
