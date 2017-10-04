package serialization.java.test;

import java.io.Serializable;

/**
 * The object to serialize.
 */
public class ObjectToSerialize implements Serializable {
    private static final long serialVersionUID = 42L;
 
    private String firstAttribute;
    private int secondAttribute;
 
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
