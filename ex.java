/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gogula Triveni
 */
public class ex {
    int a;
    void display()
    {
        a=10;
         System.out.println(a);
    }
    
}
class test{
public static void main(String[] args) {
    ex ob=new ex();
    ob.display();
    ob.a=30;
    System.out.println(ob.a);
    ob.display();
}
}