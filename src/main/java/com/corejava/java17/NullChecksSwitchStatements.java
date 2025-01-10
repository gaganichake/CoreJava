package com.corejava.java17;

public class NullChecksSwitchStatements {

    public static void main(String[] args){

        testBeforeJava17(null);
        testInJava17(null);
    }

   private static void testBeforeJava17(String s){
        // Before Java 17
       if (s == null) {
           System.out.println("oops!");
           return;
       }
       switch (s) {
           case "Foo", "Bar" -> System.out.println("Great");
           default           -> System.out.println("Ok");
       }
    }
    private static void testInJava17(String s){
        // In Java 17
        switch (s) {
//            case null : System.out.println("Oops");
            case "Foo", "Bar" -> System.out.println("Great");
            default           -> System.out.println("Ok");
        }
    }
}
