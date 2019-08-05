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
public class coprime {
     public static void main(String[] args) {
         int a=2,b=3,r;
         r=a%b;
         while(r!=0)
         {
         a=b;
         b=r;
         r=a%b;
         }
         if(b==1)
         {
             System.out.println("given numbers are coprime");
         }
         else
         {
            System.out.println("given numbers are not coprime"); 
         }
         }
    
}
