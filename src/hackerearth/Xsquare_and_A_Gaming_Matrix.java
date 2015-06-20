/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author shussain
 */
public class Xsquare_and_A_Gaming_Matrix {
    public static void main(String []args)
    {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        n=sc.nextInt();
        BigInteger c=BigInteger.ZERO;
        BigInteger[][]M=new BigInteger[n][n];
        TreeSet<BigInteger>T=new TreeSet<>();
        
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                M[i][j]=sc.nextBigInteger();
            }
        }
        int loc=0,p=n,res=0;
            for (int j = 0; j <n; j++) {
                
                for (int i = 0; i <p; i++) {
                    c=M[0][0];
                    if(c.compareTo(M[i][p-1])<0)
                { 
                    c=M[i][p-1];loc=i;
                }
                else if(c.compareTo(M[p-1][i])<0)
                {
                    c=M[p-1][i];loc=p-1;
                }
                else{
                    c=M[p-1][p-1];loc=p-1;
                }
                
                }
                res+=c.intValue();
                    System.out.println(c);
                update(M, loc);
                p--;
                }
        System.out.println(res);
        t--;}
        
    }
   public static void update(BigInteger[][]M,int i)
    {
        List<BigInteger[]> l = new ArrayList<BigInteger[]>(Arrays.asList(M));

               l.remove(i);

                 M=l.toArray(new  BigInteger[][]{});
                 
    }
   public static void Rupdate(BigInteger[][]M,int i)
    {
        List<BigInteger[]> l = new ArrayList<BigInteger[]>(Arrays.asList(M));

               l.remove(i);

                 M=l.toArray(new  BigInteger[][]{});
                 
    }
   
}
