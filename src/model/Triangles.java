package model;

public class Triangles extends absProperties {
    
    public Triangles(Double l1, Double l2, Double l3) {
        setL1(l1);
        setL2(l2);
        setL3(l3);
        this.verify();
    }
    
    public void verify() {
        if ((getL1() + getL2() > getL3()) || (getL1() + getL3() > getL2()) || (getL2() + getL3() > getL1())) {
            
            if (this.l1.equals(this.l2) && this.l1.equals(this.l3)) {
                setResponse("Equiátero = Três lados iguais");
            } else if (this.l1.equals(this.l2) || this.l1.equals(this.l3) || this.l2.equals(this.l3)) {
                setResponse("Isósceles - Dois lados iguais");
            } else {
                setResponse("Escaleno - Três lados diferentes");
            }
            
        } else {
            setResponse("Não é um triangulo");
        }
            
    }
    
}
