package com.example.motorvogn;

public class Bil {
    private String merke;
    private String type;

    public Bil(String merke, String type){
        setMerke(merke);
        setType(type);
    }

    public Bil() { }

    //Get metoder
    public String getMerke() {
        return merke;
    }

    public String getType() {
        return type;
    }

    //Set metodet
    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setType(String type) {
        this.type = type;
    }
}
