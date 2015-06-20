/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Professor_Sharma {
    public static void main(String []args)
    {
        String x,y,z;
        int t;
        Scanner sc=new Scanner(System.in);
        
      t=sc.nextInt();
      sc.nextLine();
        for (int i = 1; i <=t; i++) {
            
        
       
          int c=1;
       x=sc.next();
       
        y=sc.next();
       
        BigInteger x2=new BigInteger(x);
        int l,m;
        l=x.length();
        m=y.length();
        while(l!=m&&(l-m<=0))
        {  
            BigInteger q=new BigInteger(x);
                x=Pow(q, x2);
            c++;
          l=x.length();
            
        }
        while(!y.equals(x.substring(0, m)))
        {
            BigInteger q=new BigInteger(x);
                x=Pow(q, x2);
                c++;
         
        }
        System.out.println("Case "+i+": "+c);
        }
        }
    
 public static String Pow(BigInteger a,BigInteger b)
 {
     //a=a.multiply(b);
     
     
   
    return a.multiply(b).toString();
     
 }
}
