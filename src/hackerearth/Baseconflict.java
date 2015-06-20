/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Baseconflict {
    public static void main(String args[])throws IOException
    {
         
        int t, n,k;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
      sc.nextLine();
        ArrayList<Integer>A=new ArrayList<Integer>();
        for (int i = 0; i <t; i++) {
            A.add(sc.nextInt());
        } 
     
        
       n=sc.nextInt();
        
        
       
        int i,c=0;
     for ( i = 2; i <=16; i++) {
            for (int j = 0; j <t; j++) {
                c+=Integer.valueOf(A.get(j).toString(), i);
            }
           if(c==n)
           {
               System.out.println(i);break;
           }
           
                
            }
  
        }
        
        
        
    }
    

