/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

/**
 *
 * @author tIpz
 */
import java.io.*;
import java.util.Scanner;

public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*File f = new File("C:/Users/tIpz/Documents/NetBeansProjects/WordCount/test");
         InputStream f = new FileInputStream("f");
        
         for (String retval: test.split(" ")){
         System.out.println(retval);
         }

         }*/
        System.out.println("Please enter the file FULL path with file EXTENSION: ");
        Scanner input = new Scanner(System.in);

        String fileName = input.nextLine();
        FileReader fReader;

        try {

            fReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fReader);
            
            String cursor; 
            String content = "";
            int lines = 0;
            int words = 0;
            int chars ;
            
            
            while ((cursor = reader.readLine()) != null) {               
                lines += 1;     // count lines
                content += cursor;  // count characters             
                String[] _words = cursor.split(" ");// count words
                for (String w : _words) {
                    words++;
                }

            }
            
            chars = content.length();

            System.out.println("\nFile " + fileName + " has ");
            System.out.println(chars + " Characters,");
            System.out.println(words + " words and \n" + lines + " lines.");

        } 
        catch (FileNotFoundException ex) {
            
            System.out.println("File not found!");

        } catch (IOException ex) {
           
            System.out.println("An error has occured: " + ex.getMessage());
        }

    }
}
