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

class GF {
    public static void main(String args[] ) throws Exception {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        sc.nextLine();
        String str;
        String s="";
        int k2=2*k+1;
        str=sc.nextLine();
            for(int i=0;i<n;i++)
            {
                for (int j = i; j <k2-1; j=j+2) {
                    if(str.charAt(i)=='a'&&str.charAt(i+1)=='b')
                    {
                        s+='1';
                        s+='1';
                    }
                }
            	
                
                else
   
             
        System.out.println(s);
    }
}
