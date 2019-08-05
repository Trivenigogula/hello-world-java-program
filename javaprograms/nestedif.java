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
public class nestedif {
    public static void main(String[] args) {
         int a=4,b=8,c=10;
         if(a>b)
         {
             if(a>c)
                  System.out.println("a is large");
             else
                 System.out.println("a is large");
         }
                   else
                  {
                      if(b>c)
                           System.out.println("b is large");
                      else
                                System.out.println("c is large");                 
         }
    }
    
}
