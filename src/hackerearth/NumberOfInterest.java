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
public class NumberOfInterest {
    public static void main(String []args)
    {
        int t,x,y,n;
        
        Scanner sc=new Scanner(System.in);
        ArrayList<BigInteger> A=new ArrayList<>();
        t=sc.nextInt();
        while(t>0){
        x=sc.nextInt();
        y=sc.nextInt();
        n=sc.nextInt();
        BigInteger d=BigInteger.ZERO;
                int m=x;
        
            for (int i = 0; i <x; i++) {
                A.add(BigInteger.valueOf(y));
            }
            for (int i = x; i <n; i++) {
                for (int j = i-x; j < m; j++) {
                    d=d.add(A.get(j));
                }
                A.add(d);
                m++;
                d=BigInteger.ZERO;
            }
            //System.out.println(A);
             System.out.println(A.get(n-1));
        t--;A.clear();
        }
       
    }
    
}
