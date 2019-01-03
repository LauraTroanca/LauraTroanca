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
public class ThreadTelevizor extends Thread {
    
    private Televizor tv;
    
    public ThreadTelevizor(Televizor televizor) {
        tv = televizor;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < tv.getEmisiuni().size(); i++) {
            for (int j=0; j<100; j++) {
                tv.reda((i));
                if (tv.getEmisiune() == tv.getStapan().getSotie().getEmisiunePreferata()) {
                    tv.getStapan().setAspirare(false);
                }
            }
        }
    
    }
}