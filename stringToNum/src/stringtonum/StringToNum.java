/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringtonum;

/**
 *
 * @author tIpz
 */
public class StringToNum {

    /**
     * @param rgs the command line arguments
     */
    public static void main(String[] rgs) {
        // this program requires two 
        // arguments on the command line 
        if (rgs.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(rgs[0])).floatValue(); 
            float b = (Float.valueOf(rgs[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " +
                               (a + b));
            System.out.println("a - b = " +
                               (a - b));
            System.out.println("a * b = " +
                               (a * b));
            System.out.println("a / b = " +
                               (a / b));
            System.out.println("a % b = " +
                               (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
// TODO code application logic here
    }
    
}
