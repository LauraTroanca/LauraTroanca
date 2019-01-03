/*
 * Thread Femeie
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class ThreadFemeie extends Thread {
    
    private Femeie doamna;
    
    public ThreadFemeie(Femeie doamna) {
        this.doamna = doamna;
    }
    
    
    
    @Override
    public void run() {
        while (doamna.getSomn() == true && doamna.getVizionare() == false) {
            doamna.doarme();
        }
        while (doamna.getSomn() == false && doamna.getVizionare() == true) {
            doamna.vizioneaza();
        }
    }
    
}
