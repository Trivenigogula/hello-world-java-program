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
class one {
     int a;
    void display()
    {
        a=10;
         System.out.println(a);
    }
}
 class op {
    public static void main(String[]args){
        one ob=new one();
        ob.a=10;
        System.out.println(ob.a);
        one ob1=new one();
        ob1.a=30;
        System.out.println(ob1.a);
        
    }
}
