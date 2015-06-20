/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shussain
 */
public class Basecon {
     public static void main(String args[]) throws IOException
    {    char[]in=new char[50];
    int s=0;
        File newf=new File("Saddam.txt");
       
        FileWriter ff=new FileWriter(newf);
        ff.write("saddam\nsaaaaa\n");
        ff.flush();
        ff.close();
        FileReader r=new FileReader(newf);
       s= r.read(in);
        System.out.print(s+"=");
        for (char c : in) {
            System.out.print(c);r.close();
        }
}
}
