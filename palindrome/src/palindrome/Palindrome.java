/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import java.util.Scanner;

/**
 *
 * @author tIpz
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter sentence: ");
        String s = input.nextLine();
        //String palindrome = "Dot saw I was Tod";
        int len = s.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                s.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
        
        if(s.equals(reversePalindrome))
        {
            System.out.println("this is a palindrome");
        }
        else
            System.out.println("this is not a palindrome");
    }

        // TODO code application logic here
    
    
}
