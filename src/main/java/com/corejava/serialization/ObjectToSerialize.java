package com.corejava.serialization;

import java.io.Serializable;

/**
 * The object to serialize.
 */
public class ObjectToSerialize implements Serializable {
    private static final long serialVersionUID = 42L;
 
    private final String firstAttribute;
    private final int secondAttribute;
    //private transient int secondAttribute;//try thing
 
    public ObjectToSerialize(String firstAttribute, int secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
    }
 
    //@Override
    public String toString() {
        return ObjectToSerialize.class.getName() + ": " + 
        "firstAttribute=" + (firstAttribute != null ? firstAttribute : "[null]") + "; " +
        "secondAttribute=" + secondAttribute;
    }
}
