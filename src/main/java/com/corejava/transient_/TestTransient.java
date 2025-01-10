package com.corejava.transient_;

import java.io.*;

class TestTransient implements Serializable
{
    // Normal variables
    int i = 10, j = 20;

    // Transient variables
    transient int k = 30;

    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) throws Exception
    {
        TestTransient input = new TestTransient();

        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestTransient output = (TestTransient)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        // transient and static : Since static fields are not part of state of the object, there is
        // no use/impact of using transient keyword with static variables.
        // However, there is no compilation error.
        System.out.println("l = " + output.l);
        // transient and final : final variables are directly serialized by their values, so there is
        // no use/impact of declaring final variable as transient.
        // There is no compile-time error though.
        System.out.println("m = " + output.m);
    }
}
