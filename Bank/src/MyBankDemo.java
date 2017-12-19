
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tIpz
 */
public class MyBankDemo {
    String accountName, email, accountType, branch;
    int accountNumber;
    int balance;
    
    MyBankDemo(int Number, int bal){
        accountNumber = Number;
        balance = bal;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MyBankDemo object(90238909309,88383)= new;
        stringDisplay();
        stringDisplay(34);
        getName();
    }
    
    static void stringDisplay()
    {
        JOptionPane.showMessageDialog(null, "This is an internplacement","Industrial Internship",JOptionPane.ERROR_MESSAGE);
        
    }
    static void stringDisplay(int a)
    {
        JOptionPane.showMessageDialog(null, "This is an internplacement","Industrial Internship",JOptionPane.QUESTION_MESSAGE);
    }
    static String getName()
    {
        String name;
        name = JOptionPane.showInputDialog("Enter your name", "enterName");
        return name;
    }
    
}
