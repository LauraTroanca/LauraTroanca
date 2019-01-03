/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class ThreadBarbat extends Thread{
    
    private Barbat domn;
    
    public ThreadBarbat(Barbat domn) {
       this.domn = domn;
    }
    
    
    
    @Override
    public void run() {
        while (domn.getAspirare() == true) {
            domn.aspira();
        }
        domn.anunta();
    }
    
}
