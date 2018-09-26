/*
 * Java program Autoservice
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
    
    static Car m1 ,m2, m3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//5.a Create 3 instances of cars having different names, colors, speed, renting price and sale price
    //Create first car
    m1 = new Car("Mercedes", (short)130, YELLOW);
    m1.setRentPrice(100);
    m1.setSalePrice(15000);
    
    //Create second car
    m2 = new Car("Logan", (short)70, WHITE);
    m2.setRentPrice(80);
    m2.setSalePrice(10000);
    
    //Create third car
    m3 = new Car("Renault", (short)85, WHITE);
    m3.setRentPrice(90);
    m3.setSalePrice(11000);
        
    /*Car mm = new Car("B001ABC", 50, WHITE, 20000, 120);
    Car mh = new Car("B020DFE", 180, RED, 25000, 150);
    Car mt = new Car("B300NTD", 130, YELLOW, 15000, 100);*/
    
/*5.b. Create a private method in Autoservice, methid named "void displayAutoservice()" that display all information about all cars in format:

        Car name: ......
        Car color: ......
        Car speed: ....
        Car renting price: ....
        Car sale price: ......*/

/**
 * Method display all info in autoservice
 */
    
//5.c Display all informations about all cars calling the method displayAutoservice()
    displayAutoservice();
    
//5.d Increase speed of first car with 10
    m1.increaseSpeed(((short)m1.getSpeed()+10));

//5.e Decrease speed of second car with 10
    m2.decreaseSpeed(((short)(m2.getSpeed())-10));
    
//5.f Increase renting price of third car with 15 and decrease its sale price with 1200
    m3.decreaseSpeed(((short)(m2.getSpeed())-10));
    
//5.g Display all informations about all cars calling the method displayAutoservice()
    displayAutoservice()
    }
    
        private static void displayAutoservice() {
       System.out.println("-----Autoservice------");
       System.out.println("Car name:" + m1.getName());
       System.out.println("Car color:" + m1.getColor());
       System.out.println("Car speed:" + m1.getSpeed());
       System.out.println("Car renting price:" + m1.getRentPrice());
       System.out.println("Car sale price" + m1.getSalePrice());
       
       System.out.println("Car name:" + m2.getName());
       System.out.println("Car color:" + m2.getColor());
       System.out.println("Car speed:" + m2.getSpeed());
       System.out.println("Car renting price:" + m2.getRentPrice());
       System.out.println("Car sale price" + m2.getSalePrice());
       
       System.out.println("Car name:" + m3.getName());
       System.out.println("Car color:" + m3.getColor());
       System.out.println("Car speed:" + m3.getSpeed());
       System.out.println("Car renting price:" + m3.getRentPrice());
       System.out.println("Car sale price" + m3.getSalePrice());
    } 
 
 }
