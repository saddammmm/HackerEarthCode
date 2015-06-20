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
public class TheMagic {
    public static void main(String []args)
    {
        BigInteger i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextBigInteger();
        if(i.mod(BigInteger.valueOf(2))==BigInteger.ZERO)
        {
            System.out.println("1");
        }
    }
    
}
