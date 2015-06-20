/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Sqrt {
    public static void main(String []argd)
    {
       int s;
       Scanner sc=new Scanner(System.in);
       s=sc.nextInt();
    }
    public static float  SQRT(double s)
    {
         double k=1.0;
         while((k*k-s>=0.00001)||(s-k*k<=0.00001))
         {
             k=(s+s/k)/2;
         }
        return (float) k;
    }
}
