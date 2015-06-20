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
public class SquareInc {
    public static void main(String []args)
    {
        int t,q;
        Scanner sc=new Scanner(System.in);
        BigInteger tn= BigInteger.ZERO;
        BigInteger count= BigInteger.ZERO;
        ArrayList<BigInteger>D=new ArrayList<>();
        ArrayList<BigInteger>T=new ArrayList<>();
        t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            D.add(sc.nextBigInteger());
        }
        q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            T.add(sc.nextBigInteger());
        }
        for (int i = 0; i <q; i++) {
            System.out.println(Transac(D, T.get(i)));
        }
        
        
    }
    public static BigInteger Transac(ArrayList<BigInteger>D, BigInteger l)
    {
        BigInteger in=BigInteger.ZERO;
        int loc=0;
        for (int i = 0; i < D.size(); i++) {
            if(in.compareTo(l)<0)
            {   in=in.add(D.get(i));
            loc=i;}
        }
        
        if(loc<D.size()-1)
            return BigInteger.valueOf(loc+1);
        else if(loc==D.size()-1&&(in.compareTo(l)==0||in.compareTo(l)>0))
            return BigInteger.valueOf(loc+1);
        else
            return BigInteger.valueOf(-1);
    }
    
}
