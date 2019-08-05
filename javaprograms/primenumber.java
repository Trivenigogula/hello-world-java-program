/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gogula Triveni
 */
public class primenumber {
    public static void main(String[] args) {
         int c=0,n=5,i=0;
         for(i=1;i<=n;i++)
         if(n%i==0)
         {
             c++;
         }
         if(c==2)
         {
             System.out.println("given number is  primenumber");
         }
         else
         {
             System.out.println("given number is not a prime number");
         }
             
    }   
    }
}
