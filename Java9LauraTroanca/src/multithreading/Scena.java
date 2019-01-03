/*
 * Program Scena.
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class Scena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barbat unbarbat = new Barbat();
        Televizor tv = unbarbat.getTelevizor();
        Femeie ofemeie = unbarbat.getSotie();
        ThreadTelevizor threadtelevizor = new ThreadTelevizor(tv);
        ThreadBarbat threadbarbat = new ThreadBarbat(unbarbat);
        ThreadFemeie threadFemeie = new ThreadFemeie(ofemeie);
        threadFemeie.start();
        threadbarbat.start();
        threadtelevizor.start();
    }
    }
    

