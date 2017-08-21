/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hlavní třída umožňující práci se seznamem ladies, které vede v ArrayListu
 *
 * @author DHA
 */
public class LadiesList {

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
    }

    /**
     * Metoda vypíše všechny instance ladyRecord z ArrayListu
     */
    public static void vypisLR(ArrayList<LadyRecord> seznam) {
        for (LadyRecord lr : seznam) {
            lr.toString();
        }
    }

    /**
     * Metoda vymaže konkr. instanci ladyRecord z ArrayListu
     */
    public static void vymazLR(ArrayList<LadyRecord> seznam) {
        System.out.println("Zadej číslo záznamu k vymazání: ");
        int pom = new Scanner(System.in).nextInt();
        seznam.remove(pom - 1);
    }

    /**
     * Hlavní metoda pro práci se seznamem
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * pomocné proměnné
         */
        Scanner sc;
        String pomB = "";
        Deserialization deserialization = new Deserialization();
        Serialization serialization = new Serialization();
        /**
         * prom. reprezentuje hlavní seznam záznamů o milenkách
         */
        ArrayList<LadyRecord> seznam = new ArrayList<LadyRecord>();
        
        /** Nejdříve načteme uložená data */
        try {deserialization.read(seznam); }
        catch (Exception e) {System.out.println("Načtení ze souboru se nepovedlo"); }
        // asi není potřeba:   finally {zavriSoubor(); }
        /** Tady běhá smyčka s volbou funkcí - všechny možné procedury na seznamu */
        while (true) {
            System.out.println("ZÁLETNÍKŮV DENÍČEK");
            System.out.printf("Volby:\n1-vložit novou milenku\n2-vypsat všechny milenky"
                    + "\n3-vymazat milenku\n");
            System.out.println("Tvoje volba? ");
            int pom = new Scanner(System.in).nextInt();
            switch (pom) {
                case 1:
                    vlozLR(seznam);
                    break;
                case 2:
                    vypisLR(seznam);
                    break;
                case 3:
                    vymazLR(seznam);
                    break;
                default:
                    System.out.println("Chyba volby ...");
                    break;
            }
            System.out.println("Chceš skončit (a-ano)? ");
            pomB = new Scanner(System.in).nextLine();
            if (pomB == "a") {
                return;
            }
        }
        /** A na závěr uložení dat do souboru*/
        try {serialization.write(seznam); }
        catch (Exception e) {System.out.println("Zápis do souboru se nepovedl"); }
        // asi není potřeba: finally {zavriSoubor(); }
    }
}