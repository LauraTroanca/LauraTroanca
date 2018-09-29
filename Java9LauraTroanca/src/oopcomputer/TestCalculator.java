/*
 * Program pentru testarea calculatorului
 */
package oopcomputer;

import java.util.Scanner;

/**
 *
 * @author Troanca
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creaza un calculator
        Carcasa calculator = new Carcasa();
        
        //Apasam butoane pana apare un operator
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        calculator.butonEgal.apasa();
        
        //Scanner scanner = new Scanner(System.in);
        //Apasam butoane pana apare " = "egal
        //Afisam rezultatul
    }
    
}
