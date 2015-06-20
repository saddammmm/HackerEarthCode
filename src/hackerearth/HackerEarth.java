/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;

/**
 *
 * @author Saddam
 */
public class HackerEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        subStr("Saddam");  
        
    }
    
    public static ArrayList subStr(String str)
    {
        int length=str.length();
        ArrayList<String>S=new ArrayList<>();
        String r=null;
        for (int i = 0; i <length; i++) {
            for (int j = 1; j <=length-i; j++) {
                 r=str.substring(i, i+j);
                 S.add(r);
            }
            
        }
       return S;
    }
}
