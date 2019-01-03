/*
 * Class Televizor
 */
package multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Troanca
 */
public class Televizor {
    
    private Barbat stapan;
    private volatile String emisiune = ".";
    private List<String> emisiuni = new ArrayList();
            
    public Televizor(Barbat barbat) {
        stapan = barbat;
        emisiuni.add("Emisiune1");
        emisiuni.add("Emisiune2");
        emisiuni.add("Emisiune3");
        emisiuni.add("Emisiune4");
        emisiuni.add("Emisiune5");
    }

    public Barbat getStapan() {
        return stapan;
    }

    public String getEmisiune() {
        return emisiune;
    }

    public synchronized void setEmisiune(String emisiune) {
        this.emisiune = emisiune;
    }

    public List<String> getEmisiuni() {
        return emisiuni;
    }
    
    public void reda(Integer n) {
        if (emisiune != emisiuni.get(n)) {
            this.setEmisiune(emisiuni.get(n));
        }
    }
    
}
