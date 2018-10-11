/*
 * A program that computes your initials from your full name and displays them.
 */
package initials;

import java.util.Scanner;

/**
 *
 * @author Troanca
 */
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        
        
        String ini; 
   // we use ini to return the output
   for (int i=0; i<name.length(); i++){
      // sorry about the 3x&&, dont remember the use of trim, but you
      // can check " your name complete" if " y"==true y is what you want
      if (name.charAt(i)==" " && i+1 < name.length() && name.charAt(i+1)!=" "){
         //if i+1==name.length() you will have an indexboundofexception
         //add the initials
         ini+=name.charAt(i+1);
      }
   }
   //after getting "ync" => return "YNC"
   return ini.toUpperCase();
   
   
    }
    
}
