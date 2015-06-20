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
public class ZoomCar {
    public static void main(String []args)
    {
        int n,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        int res1=0,res2=0,res3=0,res4=0;
       if(n%2==0)
       {
          res1=n/2; 
       }
          if(n%3==0)
          {
              res2=n/3;
          }
        while(n!=0)
        {
            if((n-3)%2==0)
            {
                n=n-3;
                res3++;
            }
           else
            {
                n=n-2;
                res4++;
            }
        }
        System.out.println(res1+" "+res2+" "+res3+" "+res4);
    }
    
}
