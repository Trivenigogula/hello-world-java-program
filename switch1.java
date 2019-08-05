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
public class switch1 {
      public static void main(String[] args) {
         
         int a=5,b=4,c;
         char operator='+';
         switch(operator)
         {
             case '+':
             c=a+b;
             System.out.println(c);
             break;
             case '-':
             c=a-b;
             System.out.println(c);
                 break;
             case '*':
             c=a*b;
             System.out.println(c);
                 break;
             case '/':
                 c=a/b;
                 System.out.println(c);
                 break;
             default:
                 System.out.println(c);
                 
         }
      }
    
}
