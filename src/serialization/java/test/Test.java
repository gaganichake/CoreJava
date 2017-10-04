package serialization.java.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
    /**
     * Saves an object.
     */
    private static void saveObject(Serializable object, String filename) throws IOException {
        ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream(filename));
        objstream.writeObject(object);
        objstream.close();
    }
 
    /**
     * Loads an object.
     */
    private static Object loadObject(String filename) throws ClassNotFoundException, IOException {
        ObjectInputStream objstream = new ObjectInputStream(new FileInputStream(filename));
        Object object = objstream.readObject();
        objstream.close();
        return object;
    }
 
    public static void main(String[] args) {
        ObjectToSerialize original = new ObjectToSerialize("some text", 123);
        System.out.println(original);
        try {
            saveObject(original, "object.ser");
            ObjectToSerialize loaded = (ObjectToSerialize) loadObject("object.ser");
            System.out.println(loaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
