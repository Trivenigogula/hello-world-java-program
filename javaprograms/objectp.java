class objectparameter {
void area(int a,int c)
{
int l,b;
l=a;
b=c;
int area;
area=l*b;
System.out.println(area);
}
void parameter(int h,int y)
{
int l,b;
l=h;
b=y;
int p;
p=2*(l+b);
System.out.println(p);
}

}
class rect
{
public static void main(String[] args) {
objectparameter obj=new objectparameter();
int a=10,b=6;
obj.area(a,b);
obj.paramater(a,b);
}
}

