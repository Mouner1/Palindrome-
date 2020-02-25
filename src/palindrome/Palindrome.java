/*
 * Mouner Dabjan 
 * 24/02/2020
 * This program determines wether a word is a palindrome or not
 */
package palindrome;
import javax.swing.*; 
/**
 *
 * @author User
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variables needed
        String input;  
        String reversed = ""; 
        
        // Asking the user for an input
        input = JOptionPane.showInputDialog("Enter the word you want to find if its a palindrome or not"); 
        
        // reversing the user's input using a for loop 
        for ( int i = input.length() - 1; i >=0; i--)
        {
            reversed += input.charAt(i); 
        }
        
        
        // comparing wether or not the word is a palindrome or not 
        if (input.equalsIgnoreCase(reversed))
        {
            JOptionPane.showMessageDialog(null, input + " reversed is " + reversed + " \n It is a palindrome");
        }
        else
        {
            JOptionPane.showMessageDialog(null, input + " reversed is " + reversed + " \n Its is not palindrome"); 
        }
        
    }
    
}
