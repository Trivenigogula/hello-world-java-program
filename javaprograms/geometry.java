import java.util.*;
class geometry
{
int l,b;
float r;
double x,y;
void area(int e,int q)
{
l=e;
b=q;
System.out.println("area of rectangle="+l*b);
}
void area(float t)
{
r=t;
System.out.println("area of circle="+Math.PI*r*r);
}
void area(double i,double u)
{
x=i;
y=u;
System.out.println("area of triangle="+0.5*x*y);
}
}
class testpo
{
public static void main(String[] args) {
geometry ob=new geometry();
ob.area(10,5);
ob.area(10.21f
);
ob.area(2.5,3.5);
}
}

