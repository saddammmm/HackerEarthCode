/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LogicalOps {
    public static void main(String []args)
    {
        int t,k;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>l=new ArrayList<>();
        t=sc.nextInt();
        while(t>0){
        k=sc.nextInt();
        for (int i = 0; i <k; i++) {
           l.add(sc.nextInt());
        }int a=l.get(0);
        for (int i = 0; i <k-1; i++) {
            a=a&l.get(i);
        }
        if(a==l.get(k-1))
            System.out.println("1");
        else System.out.println("-1");
        t--;
        l.clear();}
    }
}
