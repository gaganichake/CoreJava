package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

    private static final String FILE_NAME = "object.ser";

    /**
     * Saves an object.
     */
    private static void saveObject(Serializable object) throws IOException {
        ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        objstream.writeObject(object);
        objstream.close();
    }
 
    /**
     * Loads an object.
     */
    private static Object loadObject() throws ClassNotFoundException, IOException {
        ObjectInputStream objstream = new ObjectInputStream(new FileInputStream(FILE_NAME));
        Object object = objstream.readObject();
        objstream.close();
        return object;
    }
 
    public static void main(String[] args) {
        ObjectToSerialize original = new ObjectToSerialize("some text", 123);
        System.out.println(original);
        try {
            saveObject(original);
            ObjectToSerialize loaded = (ObjectToSerialize) loadObject();
            System.out.println(loaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
