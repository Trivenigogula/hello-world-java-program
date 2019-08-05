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
import java.util.Scanner;
public class reverseanumber {
     public static void main(String[] args) {
        int n,r=0,s=0;
        System.out.println("enter a  number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
           s=n%10;
           r=r*10+s;
           n=n/10;
           
        }
        System.out.println("reversed number is "+r);
     }
}
