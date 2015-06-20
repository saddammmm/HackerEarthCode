/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class PermutationAgain {  static int f=0;
    public  static void main(String args[])
    {
        int t,n ,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            a.add(i);
        }
                
      permute(a, 0);
    }
    public static void permute(ArrayList<Integer>ar,int n)
    {    ArrayList<Integer>fin=new ArrayList<>();
    
        for (int i =n; i <ar.size(); i++) {
            Collections.swap(ar, i, n);
            permute(ar, n+1);
            Collections.swap(ar, n, i);
            
        }
        
       if (n == ar.size()-1)
           
       { //System.out.println(ar);
            int s=0;
        for (int i = 0; i <ar.size()-1; i++) {
                s+=Math.abs(ar.get(i)-ar.get(i+1));
               
            }
           System.out.println(s);
       }
      
        
    }
   
}
