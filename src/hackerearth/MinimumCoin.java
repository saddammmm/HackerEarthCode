/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
 class MinimumCoin {

  public static void main(String[] args) {
    int[] denominations = new int[] { 2, 3, 5, 7 };
    int sum,t;
      Scanner sc=new Scanner(System.in);
      t=sc.nextInt();
      while(t>0){
      sum=sc.nextInt();
    
      printArray(NumberOfCoins(sum, denominations));
      t--;}
  }
  public static int[] NumberOfCoins(int sum, int[] denominations) {
    int[] a = new int[sum + 1];
    Arrays.fill(a, Integer.MAX_VALUE-1000);
    a[0]=0;
    for (int i = 0; i <= sum; i++) {
      for (int j = denominations.length - 1; j >= 0; j--) {
        if (denominations[j] <= i) {
          a[i] = Math.min(1 + a[i - denominations[j]], a[i]);
            
        }
        
      }
    }
      
    return a;
  }

  public static void printArray(int[] a) {
     {
      System.out.println(a[a.length-1] + " ");
    }
    
  }
}
