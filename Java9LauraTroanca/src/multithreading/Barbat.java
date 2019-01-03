/*
 * Class Barbat
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class Barbat {
    
    private Televizor televizor = new Televizor(this);
    private Femeie sotie = new Femeie(this);
    private boolean aspirare = true;

    
    
    public Televizor getTelevizor() {
        return televizor;
    }

    public Femeie getSotie() {
        return sotie;
    }
    

    public void setAspirare(boolean aspirare) {
        this.aspirare = aspirare;
    }

    public boolean getAspirare() {
        return aspirare;
    }
    
    public void aspira() {
    
    }
    
    public void anunta() {
        this.sotie.seTrezeste();
    }
    
}
