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
public class arrayinput {
    public static void main(String args[]){
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[ ]=new int[n];
        System.out.println("enter the array elements");
         int i,j,temp=0;
         for(i=0;i<n;i++)
         {
              a[i]=sc.nextInt();
         }

         for(i=0;i<n;i++)
       
         int m=a.length;
         for(i=0;i<m-1;i++)
         {
             for(j=0;j<(m-i-1);j++)
             {
                 if(a[j]>a[j+1])
                 {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
             }
         }
             System.out.println("sorted array is");
             for(i=0;i<n;i++)
             {
                 System.out.println(a[i]);
             }
         
         
        
    }
    
    
}
