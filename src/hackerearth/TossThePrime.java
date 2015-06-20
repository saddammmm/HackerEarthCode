/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class TossThePrime {
     public static void main(String[]args)
    {
        int x,t;
        long m,n;
        Scanner sc=new Scanner(System.in);
       t=sc.nextInt();
        for (int q = 0; q <t; q++) {
            
        
        n=sc.nextLong();
        m=sc.nextLong();
        x=sc.nextInt();
        ArrayList<Character>X=new ArrayList<>();
        for (int i = 0; i <x; i++) {
            X.add(sc.next().charAt(0));
        }
        for (int i = x,j=0; i <Prime(BigInteger.valueOf(n), BigInteger.valueOf(m)); i++,j++) {
         
                X.add(i, X.get(j));
            
        }
        int count=0;
        for (int i = 0; i <X.size(); i++) {
            if(X.get(i)=='H')count++;
        }
        System.out.println(count);
        } 
        
    }
     public static long Prime(BigInteger p,BigInteger q)
     {
         ArrayList<BigInteger>pp=new ArrayList<>();
         for (BigInteger i = p; i.compareTo(q)<=0; i=i.add(BigInteger.ONE)) {
             
             if(isPrime(i.longValue()))pp.add(i);
         }
         return pp.size();
     }
     public static boolean isPrime(long n)
     {
         boolean t=true;
         if(n==1)return false;
         for (int i = 2; i <=Math.sqrt(n); i++) {
             if(n%i==0){t=false;break;
             
         }
  
     }
         return t;
}
}
