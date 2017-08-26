/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

import java.util.ArrayList;
import java.util.Scanner;

/* Hlavní třída pracující s databází LadiesDatabase, které vede v ArrayListu
 jednotlivé LadiesRecord
 * @author DHA
 */
public class LadiesList {

    /* Hlavní metoda pro práci se seznamem
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* pomocné proměnné */
        String pomB = "";
        /* prom. reprezentuje hlavní databázi záznamů o milenkách */
        LadiesDatabase ladiesDatabase = new LadiesDatabase();        

        /* Tady běhá smyčka s volbou funkcí - všechny možné procedury na seznamu */
        while (true) {
            System.out.println("ZÁLETNÍKŮV DENÍČEK");
            System.out.printf("Volby:\n1-vložit novou milenku\n2-vypsat všechny milenky"
                    + "\n3-vymazat milenku\n");
            System.out.println("Tvoje volba? ");
            int pom = new Scanner(System.in).nextInt();
            
            switch (pom) {
                case 1:
                    System.out.println("Zadej jméno: ");
                    String jmeno = new Scanner(System.in).nextLine();
                    System.out.println("Zadej přezdívku: ");
                    String prezdivka = new Scanner(System.in).nextLine();
                    System.out.println("Zadej věk: ");
                    int vek = new Scanner(System.in).nextInt();
                    
                    ladiesDatabase.vlozLR(new LadyRecord(jmeno, prezdivka, vek));
                    break;
                case 2:
                    ladiesDatabase.vypisLR();
                    break;
                case 3:
                    System.out.println("Zadej číslo záznamu k vymazání: ");
                    int cisloVymaz = new Scanner(System.in).nextInt();
                    
                    ladiesDatabase.vymazLR(cisloVymaz);
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
    }
}
