/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Per {
    
    public static void main(String args[])
    {
        int n,t,s1=0,s2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>B=new ArrayList<>();
        for (int i = 1; i <n/2; i++) {
            s1+=i;
        }
        for (int i = n/2+2; i <=n; i++) {
           s2+=i;
        }
        int p=2*s1+n/2;
       int k=2*s2+n/2+1;
        System.out.println(Math.abs(k-p));
    }
    
}
