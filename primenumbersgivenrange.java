/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Gogula Triveni
 * 
 */
public class primenumbersgivenrange 
{
    public static void main(String [] args)
    {
        int i,j,n=100,c;
        for(i=2;i<n;i++)
        {
         c=0;   
            for(j=1;j<=i;j++)
            {
        if(i%j==0)
        {
            c++;
        }
            }
        if(c==2)
        {
        System.out.println(i);
        }
    }
        }
  }       
        
