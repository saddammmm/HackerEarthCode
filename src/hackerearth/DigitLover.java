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
public class DigitLover {
    public static void main(String[]args)
    {
        int t;
        Scanner sc=new Scanner(System.in);
        String s;
        t=sc.nextInt();
        sc.nextLine();
        while(t>0){
        s=sc.nextLine();
        int a=0;
        int l=s.length();
        while(l!=1)
        {  a=0;
            for (int i = 0; i <l; i++) {
               
                a+=Integer.parseInt(s.substring(i, i+1));
            }
            
            
            s=""+a;
            l=s.length();
           
            //System.out.println(a);
        }
        System.out.println(a);
        t--;}
        
    }
}
