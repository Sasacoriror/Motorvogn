package com.example.motorvogn;

public class Motorvogn {
    private long personnr;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String merke;
    private String type;

    public Motorvogn(int personnr, String navn, String adresse, String kjennetegn, String merke, String type){
        setPersonnr(personnr);
        setNavn(navn);
        setAdresse(adresse);
        setKjennetegn(kjennetegn);
        setMerke(merke);
        setType(type);
    }

    //Get metodene
    public Motorvogn () { }

    public long getPersonnr() {
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
    public void setPersonnr(long personnr) {
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
