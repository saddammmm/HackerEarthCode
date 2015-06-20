/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import static hackerearth.Simpson.Fib;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Saddam2 {
    


    public static void main(String[]args)
    {
        int t;
        BigInteger n,x,y;
        BigInteger M=new BigInteger("1000000007");
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        n=sc.nextBigInteger();
        x=sc.nextBigInteger();
        y=sc.nextBigInteger();
            BigInteger prev=BigInteger.ZERO;
        BigInteger nth=n.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(2));
        BigInteger r=BigInteger.ZERO;
        BigInteger a=x.add(M);
        BigInteger b=a.add(M);
        n=n.mod(M);
       while(nth.compareTo(n.add(BigInteger.ONE))<=0)
       {
           r=a.add(b);
           
           a=b;
           b=r;
           prev=a;
           nth=nth.add(BigInteger.ONE);
       }
            System.out.println(prev+" "+r);
        
        t--;}
    }
    
}
