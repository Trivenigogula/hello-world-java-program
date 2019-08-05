
 import java.util.Scanner;
public class power1 {
    public static void main(String args[]){
    
        int n,p,r=1;
         System.out.println("enter the base number");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        System.out.println("enter the power number");
        p=sc.nextInt();
        if(n>=0&&p==0)
        {
            r=1;
        }
        else if(n==0&&n>=1)
        {
            r=0;
        }
        else
        {
            for(int i=1;i<=p;i++)
            {
                r=r*n;
            }
        }
        System.out.println(n+"^"+p+"="+r);
        
        
   
    
    }
    
}
