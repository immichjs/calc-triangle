package model;

public abstract class absProperties {

    protected String message = "";
    protected String side1;
    protected String side2;
    protected String side3;
    protected Double l1;
    protected Double l2;
    protected Double l3;
    protected String response;    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSide1() {
        return side1;
    }

    public void setSide1(String side1) {
        this.side1 = side1;
    }

    public String getSide2() { 
        return side2;
    }

    public void setSide2(String side2) {
        this.side2 = side2;
    }

    public String getSide3() {
        return side3;
    }

    public void setSide3(String side3) {
        this.side3 = side3;
    }

    public Double getL1() {
        return l1;
    }

    public void setL1(Double l1) {
        this.l1 = l1;
    }

    public Double getL2() {
        return l2;
    }

    public void setL2(Double l2) {
        this.l2 = l2;
    }

    public Double getL3() {
        return l3;
    }

    public void setL3(Double l3) {
        this.l3 = l3;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
