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
public class gcd {
    public static void main(String[] args) {
        int n,m;
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        System.out.println("enter second number");
        n=sc.nextInt();
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        System.out.println(n);
    }
    
}
