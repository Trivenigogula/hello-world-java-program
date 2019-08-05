/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Gogula Triveni
 */
public class rectangle {
    int l,b;
    void area()
    {
        int area;
        area=l*b;
         System.out.println(area);
    }
    void parameter()
    {
        int p;
        p=2*(l+b);
        System.out.println(p);
        
    }
}
class rectangle1
{
     public static void main(String[] args) {
         rectangle obj=new rectangle();
         obj.l=10;
         obj.b=5;
         obj.area();
         obj.parameter();
     }
}
