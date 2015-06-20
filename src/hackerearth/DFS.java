/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shussain
 */
public class DFS {
    public static void main(String []args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int [][]maze=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                maze[i][j]=sc.nextInt();
            }
            
        }
    }
    public static void DFSE(int mat[][],int source)
    {
        Stack<Integer> stack=new Stack<Integer>();
        int number_of_node=mat[source].length-1;
        ArrayList<Integer>visi=new ArrayList<>();
        int element=source;
        
    }
}
