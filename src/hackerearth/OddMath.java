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
public class OddMath {
    public static void main(String []args)
    {
       int t;
        BigInteger n;
        Scanner sc=new Scanner(System.in);
         n=sc.nextBigInteger();
        t=sc.nextInt();
        while(t>0){
        n=sc.nextBigInteger();
        BigInteger r=BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n)<=0; i=i.add(BigInteger.ONE)) {
            if(i.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)>0)
            { r=r.add(i);
                
            }
            //if(i.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0)
             else
            { r=r.add(lar(i));
                }
        }
        System.out.println(r);
       t--; }
        //System.out.println(lar(n));
    }
    public static BigInteger lar(BigInteger a)
    {
        BigInteger b=a.divide(BigInteger.valueOf(2));
        if(b.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0)
        { 
           b= lar(b);
        }
        
            return b;
    }
}
