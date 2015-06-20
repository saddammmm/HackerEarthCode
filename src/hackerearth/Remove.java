/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

//import java.math.int;
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
public class Remove {
    public static void main(String []args)
    {
       
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       BigInteger[][] array=new BigInteger[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]=sc.nextBigInteger();
            }
        }


        
        update(array, n-1);
      
    }
    public static void update(BigInteger[][]M,int i)
    {
        List<BigInteger[]> l = new ArrayList<BigInteger[]>(Arrays.asList(M));

               l.remove(i);
        
                 M=l.toArray(new  BigInteger[][]{});
    }
}
