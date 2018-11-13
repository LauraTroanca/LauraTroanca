/*
 * Program that launches 3 new Notepad files
 */
package multithreading;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Troanca
 */
public class ThreeNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             ProcessBuilder pb = new ProcessBuilder("notepad.exe");
             Process p1 = pb.start();
             Process p2 = pb.start();
             Process p3 = pb.start();
             } 
        catch (IOException ex) {
             Logger.getLogger(ThreeNotepads.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
         }
    }
    
}
