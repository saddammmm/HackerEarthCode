/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Let {
    public static void main(String args[])
    {
        int []prim={2,3,5,7};
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println(min(prim, x));
    }
    
    public static int min(int[] arr,int k)
    {
      int[]A=new int[k+1];
      Arrays.fill(A,Integer.MAX_VALUE-1000);
      A[0]=0;
        for (int i = 0; i <=k; i++) {
            for (int j = arr.length-1; j >=0; j--) {
                if(arr[j]<=k)
                {
                    A[i]=Math.min(1+A[i-arr[j]], A[i]);
                }
                
            }
            
        }
        return A[A.length-1];
    }
    
}
