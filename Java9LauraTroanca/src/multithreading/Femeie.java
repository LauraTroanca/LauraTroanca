/*
 * Class Femeie
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class Femeie {
    
    private Barbat sot;
    
    private String emisiunePreferata = "Emisiune3";
    private boolean somn = true;
    private boolean vizionare = false;
    
    public Femeie(Barbat barbat) {
        sot = barbat;
    }

    
    
    public boolean getSomn() {
        return somn;
    }

    public boolean getVizionare() {
        return vizionare;
    }
   
    public void seTrezeste() {
        somn = false;
        vizionare = true;
    }
    
    public void vizioneaza() {
        
    }
    
    public String getEmisiunePreferata() {
        return emisiunePreferata;
    } 
    
    public void doarme() {
        
    }
    
}
