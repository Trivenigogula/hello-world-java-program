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
public class student {
    int rollno,phno;
    void display()
    {
        System.out.println("rollno="+rollno);
        System.out.println("phno="+phno);

    }
    
}
class test_student{
         public static void main(String[] args) {
             student s1=new student();
             s1.rollno =155;
             s1.phno =48973897;
             s1.display();
         }
}

