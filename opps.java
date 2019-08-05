
 class opp {
    int a;
            opp()
            {
                a=10;
            }
                opp(int x)
                {
                    a=x;
                }
}
class opps
{
            public static void main(String[] args) {
             opp ob=new opp();
             opp ob1=new opp(20);
             System.out.println(ob.a);
             System.out.println(ob1.a);
    }
}
