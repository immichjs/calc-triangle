package model;

public class Validation extends absProperties {
    
    public Validation(String side1, String side2, String side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        this.validate();
    }
    
    private void validate() {
        message = "";
        
        try {
            this.l1 = Double.parseDouble(this.side1);
            this.l2 = Double.parseDouble(this.side2);
            this.l3 = Double.parseDouble(this.side3);
        } catch (Exception e) {
            message = "Erro de conversão";
        }
    }
}