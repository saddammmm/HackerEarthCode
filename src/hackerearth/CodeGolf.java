/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class CodeGolf {
    public static void main(String[]args)
    {
        long n;
        int t;
        DecimalFormat f=new DecimalFormat("0.000000000000");
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t>0){
        n=s.nextLong();
        double r=0;
        for (int i = 0; i <n; i++) {
           r+=Math.pow(-1, i)/(i*2+1);
        }
        System.out.println(f.format(r));t--;}
    }
}
