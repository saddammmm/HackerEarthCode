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
public class LaderToHaven {
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        ArrayList<BigInteger>F=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            F.add(sc.nextBigInteger());
        }
        for (int i = 0; i <n; i++) {
            System.out.println(evenF(F.get(i)));
        }
        
    }
    public static BigInteger evenF(BigInteger n)
    {
        BigInteger a,b,c=BigInteger.ZERO,s=BigInteger.ZERO;
        a=BigInteger.ONE;
        b=BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; a.add(b).compareTo(n)<0; i=i.add(BigInteger.ONE)) {
            c=a.add(b);
            a=b;
            b=c;
            //System.out.println(c);
            if(c.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0)
            {
                s=s.add(c);
            }
        }
        return s;
    }
}
