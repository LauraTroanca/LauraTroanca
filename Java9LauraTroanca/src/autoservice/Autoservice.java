/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import static autoservice.Car.Color.RED;
import static autoservice.Car.Color.WHITE;
import static autoservice.Car.Color.YELLOW;

/**
 *
 * @author Troanca
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Car m1 = new Car("B001ABC", 50, WHITE, 20000, 120);
    Car m2 = new Car("B020DFE", 180, RED, 25000, 150);
    Car m3 = new Car("B300NTD", 130, YELLOW, 15000, 100);
    
    String cuc = m1.getName();  //nu vede m1 daca scriu in displayAutoservice
    System.out.println(cuc);
    
    //displayAutoservice();
    
    }
    
    private static void displayAutoservice() {
        
    }
    
}
