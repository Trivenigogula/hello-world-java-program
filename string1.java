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
 class string1 {
    static void main(String[] args) {
        String s1="hello";
        System.out.println(s1);
        String s2 =new String();
        s2="welcome to rgukt";
        System.out.println(s2);
        String s3=new String("welcome to cse");
        System.out.println(s3);
        char str[]={'h','e','l','l','o'};
        System.out.println(str);
        System.out.println("enter aa string");
        Scanner ob=new Scanner(System.in);
        String s5=ob.nextLine();
        System.out.println(s5);
        String s6=new String(str,1,3);
        System.out.println(s6);
        s1.replace('l','a');
        System.out.println(s1);
        System.out.format(s5);
String s8=s1.toUpperCase();
System.out.println(s8);
String s9=s3.toLowerCase();
System.out.println(s9);
String s10=s3.substring(2);
System.out.println(s10);
System.out.println(s1.replace('h','i'));


        
        
        
    }
    
}
