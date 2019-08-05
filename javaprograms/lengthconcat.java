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
public class lengthconcat {
    public static void  main(String args[]) {
    String s1="ab";
    int n=s1.length();
    System.out.println(n);
     String s2 =new String();
     s2="ac";
      String s3=s1.concat(s2);
     System.out.println(s3);
     System.out.println(s1.concat(s2));
     System.out.println(s1+s2);
     int m=s1.compareTo(s2);
     int p=s1.compareToIgnoreCase(s2);
     System.out.println(m);
     System.out.println(p);
     System.out.println(s1.equals(s2));
     System.out.println(s1.equalsIgnoreCase(s2));
    }
    
     
}
