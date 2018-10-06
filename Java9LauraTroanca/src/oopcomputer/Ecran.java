/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author Troanca
 */
public class Ecran {
    
    private String afisaj = "0";
    private Carcasa stapana;

    public Ecran(Carcasa NouaStapana) {
        this.stapana = NouaStapana;
    }

    public String getAfisaj() {
        return afisaj;
    }
    
    

    public void setAfisaj(String afisaj) {
        switch (afisaj) {
            case "+":
                
                afisaj="+";
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            case "=":
                break;
            default: 
            
                
        }
        
        
        
    }
    
    
    private void operatiuneLocala(char c){
    stapana.getAlu().setOperandUnu(Integer.getInteger(afisaj));
                stapana.getAlu().setOperator('+');
}
    
}
