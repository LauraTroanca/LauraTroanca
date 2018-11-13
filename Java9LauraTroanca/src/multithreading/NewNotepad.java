/*
 * Program that launches a new Notepad file
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class NewNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
         System.out.println("Creating Process...");
         Process process = Runtime.getRuntime().exec("notepad.exe");
         process.waitFor();
         // when you manually close the running program notepad.exe, the next line of code will be executed
         System.out.println("Program terminated...");
      } catch (Exception e) {
         System.out.println(":: -----------Exception-------------- :: \n"+e);
      }
    }
    
}
