/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Tato třída vytváří DBA LadyRecordů tím, že je uchovává v ArrayListu
 * @author DHA
 */
public class LadiesDatabase {
    protected ArrayList<LadyRecord> database;
    
    public LadiesDatabase () {
        this.database = new ArrayList<LadyRecord>();
        /* Rovnou i načte seznam ze souboru */
        try {
            Static.read(database);
        } catch (Exception e) {
            System.out.println("Načtení ze souboru se nepovedlo");
        }
    }
    
    /* Metoda přidá instanci ladyRecord do ArrayListu */
    public void vlozLR(LadyRecord record) {
        this.database.add(record);
        /* a rovnou i uloží do souboru */
        try {
            Static.write(database);
        } catch (Exception e) {
            System.out.println("Zápis do souboru se nepovedl");
        }
    }
    /* Metoda vypíše všechny instance ladyRecord z ArrayListu */
    public void vypisLR() {
        for (LadyRecord lr : database) {
            System.out.println(lr.toString());
        }
    }
    /* Metoda vymaže konkr. instanci ladyRecord z ArrayListu */
    public void vymazLR(int cisloVymaz) {
        this.database.remove(cisloVymaz - 1);
        /* a rovnou i uloží do souboru */
        try {
            Static.write(database);
        } catch (Exception e) {
            System.out.println("Zápis do souboru se nepovedl");
        }
    }   
}
