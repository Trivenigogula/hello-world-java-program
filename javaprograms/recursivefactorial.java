/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfunction;

/**
 *
 * @author Gogula Triveni
 */
import java.util.Scanner;
public class recursivefactorial {
   static int f(int n){
        if(n==0)
            return 1;
        else
            return(n*f(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact=f(n);
        System.out.println(fact);
        
        
        
        
    }    
}
