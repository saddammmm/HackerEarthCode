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
public class LIC {
    public static void main(String[] args) {
		int n;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>A=new ArrayList<>();
        n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
            
        }
        
    }
    public static int Cp(ArrayList<Integer>A)
    {
        ArrayList<Integer>L=new ArrayList<>();
        L.add(A.get(0));
        for (int i = 1; i <A.size(); i++) {
            for (int j = 0; j <i; j++) {
                if(A.get(j)<A.get(i)&&(L.))
                
            }
        }
    }
}
