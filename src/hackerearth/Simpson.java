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
public class Simpson {
    public static void main(String[]args)
    {
        int t;
        BigInteger n,x,y;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        n=sc.nextBigInteger();
        x=sc.nextBigInteger();
        y=sc.nextBigInteger();
        //
        BigInteger nth=n.divide(BigInteger.valueOf(2));
       
        Fib(x, y, n, nth);
        t--;}
    }
    public static void Fib(BigInteger a,BigInteger b,BigInteger c,BigInteger d)
    {
        BigInteger r=BigInteger.ZERO;
        BigInteger M=new BigInteger("1000000007");
        BigInteger j=a,k=b,pre=BigInteger.ZERO;
        for (BigInteger i = d.add(BigInteger.valueOf(2)); i.compareTo(c.add(BigInteger.ONE)) <=0; i=i.add(BigInteger.ONE)) {
            r=j.add(k);
            
           j=k;
           k=r;
           pre=j;
        }
        System.out.println(pre.mod(M)+" "+r.mod(M));
        
        
    }
}
