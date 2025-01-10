package com.corejava.java17;

public class InstanceofChecking {

    public static void main(String[] args){
        //    Before Java 16
        Object o = null;
        if (o instanceof String)
        {
            String s = (String) o;
            String.format("String %s", s);
        }
        else if (o instanceof Integer)
        {
            Integer i = (Integer) o;
            String.format("int %d", i);
        }
        else if (o instanceof Double)
        {
            Double d = (Double) o;
            String.format("double %f", d);
        }

//    In Java 16

        if (o instanceof String s)
        {
            String.format("String %s", s);
        }
        else if (o instanceof Integer i)
        {
            String.format("int %d", i);
        }
        else if (o instanceof Double d)
        {
            String.format("double %f", d);
        }

//    In Java 17
        switch (o)
        {
            case Integer i -> String.format("int %d", i);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        }
    }

}
