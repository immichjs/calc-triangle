package model;

public class Control extends absProperties {
    
    public Control(String side1, String side2, String side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        this.verifiy();
    }
    
    private void verifiy() {
        this.message = "";
        
        Validation validation = new Validation(this.side1, this.side2, this.side3);
        
        if (validation.getMessage().equals("")) {
            Triangles triangles = new Triangles(validation.getL1(), validation.getL2(), validation.getL3());
            
            setResponse(triangles.getResponse());
        } else {
            this.message = validation.getMessage();
        }
    }
}
