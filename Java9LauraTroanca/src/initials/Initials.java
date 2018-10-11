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
        
        
        String ini = name.substring(0, 1);
        
   
       for (int i=0; i<name.length(); i++){
          if ((name.charAt(i)==' ' )&& (i+1 < name.length()) &&(name.charAt(i+1)!=' ')){
             ini= ini + name.charAt(i+1);
          }
        }
   
       ini = ini.toUpperCase();
       System.out.println("Your initials are " + ini);
    }
    
}
