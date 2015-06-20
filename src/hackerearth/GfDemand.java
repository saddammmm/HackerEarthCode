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
public class GfDemand {
    public static void main(String args[])
    {
        int q;
        String d;
        Scanner sc=new Scanner(System.in);
        d=sc.nextLine();
        q=sc.nextInt();
       
        BigInteger[][]Q=new BigInteger[q][2];
        int l=d.length()-1;
        System.out.println(l);
       for (int i = 0; i <q; i++) {
            for (int j = 0; j <2; j++) {
                Q[i][j]=sc.nextBigInteger().mod(BigInteger.valueOf(d.length()));
            }
            
            for (int j = 0; j <=q; j++) {
             
                    if(d.charAt(Q[j][0].subtract(BigInteger.ONE).intValue())==d.charAt(l-(Q[j][1].subtract(BigInteger.ONE).intValue())))
                    { System.out.println("YES");}
                    else
                        System.out.println("NO");
 
            }
            
                
            
            
       }
        
        
    }
    
            
}
