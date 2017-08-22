/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

/**
 * Třída je určená pro statické metody
 *
 * @author DHA
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Static {

    private static String fname = "ladies.txt";

    /* Metoda zapisuje do souboru */
    public static void write(Object obj) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fname))) {
            out.writeObject(obj);
        }
    }

    /* Metoda čte ze souboru */
    public static void read(Object obj) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fname))) {
            in.readObject();
        }
    }

}
