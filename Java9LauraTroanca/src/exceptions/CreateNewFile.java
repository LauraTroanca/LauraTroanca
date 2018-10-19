/*
 * Program that creates a file and opens it to write text in it.
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Troanca
 */
public class CreateNewFile {

    /**
     * @param args the command line arguments
     */
    
    private static final String FILENAME = "C:\\Users\\Troanca\\Desktop\\test.txt";
    
    public static void main(String[] args) {
        
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

                String content = "This is the content to write into file\n";

                fw = new FileWriter(FILENAME);
                bw = new BufferedWriter(fw);
                bw.write(content);

                System.out.println("Done");

        } catch (IOException e) {
        } finally {

                try {

                        if (bw != null)
                                bw.close();

                        if (fw != null)
                                fw.close();

                } catch (IOException ex) {
                }

        }

        
       



    }
    
}
