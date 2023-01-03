package com.example.motorvogn;

public class Motorvogn {
    private int id;
    private int personnr;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String merke;
    private String type;

    public Motorvogn(int id, int personnr, String navn, String adresse, String kjennetegn, String merke, String type){
        setId(id);
        setPersonnr(personnr);
        setNavn(navn);
        setAdresse(adresse);
        setKjennetegn(kjennetegn);
        setMerke(merke);
        setType(type);
    }

    public Motorvogn () { }

    //Get metodene
    public int getId() {
        return id;
    }

    public int getPersonnr() {
        return personnr;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public String getMerke() {
        return merke;
    }

    public String getType() {
        return type;
    }

    //Set metodene

    public void setId(int id) {
        this.id = id;
    }

    public void setPersonnr(int personnr) {
        this.personnr = personnr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setType(String type) {
        this.type = type;
    }
}
