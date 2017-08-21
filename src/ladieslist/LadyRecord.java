/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

/**
 * Třída představuje seznam milenek (tzv. záletníkův pomocný notýsek)
 * chceme do ArrayListu seznam všech instancí s údaji o dámách
 * chceme, aby se tento ArrayList na začátku deserializoval ze souboru a na konci
   opět serializoval do souboru
 * vkládání údajů + ser. a deser. aby byla ošetřena výjimkami
 * každá třída měla gettery, settery a overridelý toString
 * @author DHA
 */
public class LadyRecord {
    /** Každá lady bude zatím mít: jméno, přezdívku a věk + kontrolu plnoletosti
     * to samé se dá nastait příp. u dalších param. */
    private String jmeno;
    private String prezdivka;
    private int vek;
    private boolean plnoletost;
    
    public LadyRecord (String jmeno, String prezdivka, int vek) {
        this.jmeno = jmeno;
        this.prezdivka = prezdivka;
        this.vek = vek;
        if (vek < 15) {
            this.plnoletost = false;
        } else {
            this.plnoletost = true;
        }
    }
    
    /** Gettery a settery */
    public void setJmeno (String jmeno) {
        this.jmeno = jmeno;
    }
    public void setPrezdivka (String prezdivka) {
        this.prezdivka = prezdivka;
    }
    public void setVek (int vek) {
        this.vek = vek;
        if (vek < 15) {
            this.plnoletost = false;
        } else {
            this.plnoletost = true;
        }
    }
    public String getJmeno () {
        return this.jmeno;
    }
    public String getPrezdivka () {
        return this.prezdivka;
    }
    public int getVek () {
        return this.vek;
    }
    public boolean getPlnoletost () {
        return this.plnoletost;
    }
    @Override
    /** Přepsaná metoda toString, vrací přehledně údaje o konkr. lady
    * return Údaje o konkr. lady */
    public String toString () {
        String pom = ("Jméno: "+jmeno+", Přezdívka: "+prezdivka+", Věk: "+vek+
                ", Plnoletost: ");
        if (plnoletost) {
            pom = pom + ("OK");
        } else {
            pom = pom + ("bacha, pod zákonem");
        }
        return pom;
    }
    
}
