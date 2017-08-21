/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladieslist;

/**
 *
 * @author DHA
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Deserialization {
private static String fname;

    void read(Object obj) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fname))) {
            in.readObject(obj);
        }
    }
}
