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
        /**
         * prom. reprezentuje hlavní seznam záznamů o milenkách
         */
        ArrayList<LadyRecord> seznam = new ArrayList<LadyRecord>();
        
        /** Nejdříve načteme uložená data */
        try {Static.read(seznam); }
        catch (Exception e) {System.out.println("Načtení ze souboru se nepovedlo"); }
      
        /** Tady běhá smyčka s volbou funkcí - všechny možné procedury na seznamu */
        while (true) {
            System.out.println("ZÁLETNÍKŮV DENÍČEK");
            System.out.printf("Volby:\n1-vložit novou milenku\n2-vypsat všechny milenky"
                    + "\n3-vymazat milenku\n");
            System.out.println("Tvoje volba? ");
            int pom = new Scanner(System.in).nextInt();
            switch (pom) {
                case 1:
                    LadiesSeznam.vlozLR(seznam);
                    break;
                case 2:
                    LadiesSeznam.vypisLR(seznam);
                    break;
                case 3:
                    LadiesSeznam.vymazLR(seznam);
                    break;
                default:
                    System.out.println("Chyba volby ...");
                    break;
            }
            System.out.println("Chceš skončit (a-ano)? ");
            pomB = new Scanner(System.in).nextLine();
            if (pomB.equals("a")) {
                break;
            }
        }
        /** A na závěr uložení dat do souboru*/
        try {Static.write(seznam); }
        catch (Exception e) {System.out.println("Zápis do souboru se nepovedl"); }
     
    }
}