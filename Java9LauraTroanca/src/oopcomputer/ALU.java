/*
 * Arithmetical and Logical Unit
 */
package oopcomputer;

/**
 *
 * @author Troanca
 */
public class ALU {
    
    private Integer operandUnu;
    private Integer operandDoi;
    private Character operator;

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    private Integer rezultat;

    public Integer getOperandUnu() {
        return operandUnu;
    }

    public void setOperandUnu(Integer operandUnu) {
        this.operandUnu = operandUnu;
    }

    public Integer getOperandDoi() {
        return operandDoi;
    }

    public void setOperandDoi(Integer operandDoi) {
        this.operandDoi = operandDoi;
    }

    public Integer getRezultat() {
        return rezultat;
    }

    public void setRezultat(Integer rezultat) {
        this.rezultat = rezultat;
    }
    
    
    public void calculeaza(){
        
        switch (operator){
            case '+': 
                rezultat = operandUnu + operandDoi;
                break;
            case '-': 
                rezultat = operandUnu - operandDoi;
                break;
            case '*': 
                rezultat = operandUnu * operandDoi;
                break;
                case '/': 
                rezultat = operandUnu / operandDoi;
                break;
                default: 
                        System.out.println("Operatorul este incorect.Folositi +,-,* sau /. ");
        }
        
    }
    
}