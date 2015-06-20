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
public class tesr {
    public static void main(String args[])
    {
        String s;
        int t1;
         boolean t;
        ArrayList<Character>B=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        t1=sc.nextInt();
        sc.nextLine();
        for (int o = 0; o <t1; o++) {
            t=true;
   
     s=sc.nextLine();
    
        
        int h=0;    
       for (char c : s.toCharArray()) {
  B.add(c);h++;
}
        System.out.println(B);
        B.clear();
        }  
        }
    
}
