/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class NEWEXPE {
    public static void main(String[]args)
    {
        List<List<BigInteger>>M=new ArrayList<>();
        int n,t;
        
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
             List<BigInteger>E=new ArrayList<>();
             for (int j = 0; j < n; j++) {
                E.add(sc.nextBigInteger());
            }
                
                M.add(E);
            
        }
        
       
        BigInteger resu=BigInteger.ZERO;
        for (int i = 0; i <n; i++) {
            resu=resu.add(Largest(M));
            
            System.out.println(resu);
        }
        System.out.println(resu);
        t--;
        
            System.out.println(M);
        }
    }
    public static BigInteger Largest(List<List<BigInteger>>M)
    {
        BigInteger c=M.get(0).get(0);
       
        int n=M.size();
         BigInteger d=M.get(n-1).get(0);
        if(c.compareTo(M.get(0).get(n-1))<0)
            c=M.get(0).get(n-1);
        if(d.compareTo(M.get(n-1).get(n-1))<0)
            d=M.get(n-1).get(n-1);
        if(c.compareTo(d)<0)
        {
            M.remove(n-1);
            for (List<BigInteger> list : M) {
                M.remove(0);
            }
            return d ;
        }
        else
        { 
            M.remove(0);
             for (List<BigInteger> list : M) {
                M.remove(0);
            }
          
           
            return c;
        }
    }
   
}
