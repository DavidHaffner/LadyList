/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * seznam repr. soubor všech záznamů o ladies
 * @author DHA
 */
public class LadiesSeznam {
    protected ArrayList<LadyRecord> seznam;
    
    public void LadiesSeznam () {
        this.seznam = seznam;
        /** Rovnou i načte seznam ze souboru                               !!!*/
        
    }
    
    /**
     * Metoda přidá instanci ladyRecord do ArrayListu
     */
    public static void vlozLR(ArrayList<LadyRecord> seznam) {
        System.out.println("Zadej jméno: ");
        String jmeno = new Scanner(System.in).nextLine();
        System.out.println("Zadej přezdívku: ");
        String prezdivka = new Scanner(System.in).nextLine();
        System.out.println("Zadej věk: ");
        int vek = new Scanner(System.in).nextInt();

        LadyRecord ladyRecord = new LadyRecord(jmeno, prezdivka, vek);
        seznam.add(ladyRecord);
        /** a rovnou i uloží do souboru                                    !!!*/
        
    }
    /**
     * Metoda vypíše všechny instance ladyRecord z ArrayListu
     */
    public static void vypisLR(ArrayList<LadyRecord> seznam) {
        for (LadyRecord lr : seznam) {
            lr.toString();
        }
        /** a rovnou i uloží do souboru                                    !!!*/
        
    }
    /**
     * Metoda vymaže konkr. instanci ladyRecord z ArrayListu
     */
    public static void vymazLR(ArrayList<LadyRecord> seznam) {
        System.out.println("Zadej číslo záznamu k vymazání: ");
        int pom = new Scanner(System.in).nextInt();
        seznam.remove(pom - 1);
    }
    /** a rovnou i uloží do souboru                                        !!!*/
    
}
