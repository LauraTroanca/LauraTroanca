/*
 * CLasa buton din care vom crea butoanele.
 */
package oopcomputer;

/**
 *
 * @author Troanca
 */
public class Buton {

private Character simbol = ' ';

 public Buton(Character noulSimbol){
     simbol = noulSimbol;
 }   
 
public Character apasa() {
    
    return simbol;
}
}
