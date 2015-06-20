/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author shussain
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
 
 
public class SquareRootOfBigItegerExample  {
       
    public static void main(String[] args) {
       
                SquareRootOfBigItegerExample  SquareRootOfBigIntegerExample = new  SquareRootOfBigItegerExample ();
                String n = "";
                   
                MathContext mc =  new MathContext(0, RoundingMode.DOWN);
                mc = MathContext.DECIMAL32;
 
                BigInteger my2P100000  = new BigInteger("0");
                BigInteger two      = new BigInteger("2");
                BigInteger one      = new BigInteger("1");
               
                my2P100000  = two.shiftLeft(2000 - 1);
                       
                System.out.println("2^2000 --  Step 1");
                System.out.println("Value of 2^2,000 " + my2P100000  );
                System.out.println("");
                System.out.println("Finding the Square Root of 2^2000");
                               
               
                String mys =  my2P100000  + "";
                n = (mys) ;
                int firsttime = 0;
               
                BigDecimal myNumber = new BigDecimal(n);
                BigDecimal g = new BigDecimal("1");
                BigDecimal my2 = new BigDecimal("2");
                BigDecimal epsilon = new BigDecimal("0.0000000001");
       
                BigDecimal nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
               
                //Get the value of n/g
                BigDecimal nBygPlusg = nByg.add(g);
               
                //Get the value of "n/g + g
                BigDecimal nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
               
                //Get the value of (n/g + g)/2
                BigDecimal  saveg = nBygPlusgHalf;
                firsttime = 99;
               
                do
                {
                        g = nBygPlusgHalf;
                        nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
                        nBygPlusg = nByg.add(g);
                        nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
                        BigDecimal  savegdiff  = saveg.subtract(nBygPlusgHalf);
                           
                        if (savegdiff.compareTo(epsilon) == -1 )
                        {
                            firsttime = 0;
                        }
                        else
                        {
                            saveg = nBygPlusgHalf;
                        }
                       
                } while (firsttime > 1);
               
                System.out.println("For " + mys + "\nLength: " + mys.length() + "\nThe Square Root is " + saveg);
           
    }
}
 
