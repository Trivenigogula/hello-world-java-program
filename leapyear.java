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
public class leapyear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter year");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
     
            System.out.println("given year is leap year");
        else
            System.out.println("given year is not a leap year");
    }
    
}
