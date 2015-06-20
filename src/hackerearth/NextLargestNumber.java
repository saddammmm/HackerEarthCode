/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author shussain
 */
public class NextLargestNumber {
    private int id;
    public static void main(String[]args)
    {
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>Q=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        //TreeSet<Integer>tem=new TreeSet<>();
        int n,l,r,q;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=sc.nextInt();
        r=sc.nextInt();
        q=sc.nextInt();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i <q; i++) {
            Q.add(sc.nextInt());
        }
        for (int i = l; i <=r; i++) {
            temp.add(A.get(l));
        }
        Collections.sort(temp);
        for (int i = 0; i <q; i++) {
            for (int j = 0; j < 10; j++) {
                if(temp.get(j)>Q.get(i))
                { System.out.println(temp.get(j));}
               
            }
            System.out.println("-1");
        }
       
    }
                 
    }
    
    
 

