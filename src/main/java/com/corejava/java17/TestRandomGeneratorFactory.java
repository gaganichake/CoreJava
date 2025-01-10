package com.corejava.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class TestRandomGeneratorFactory {

    public static void main(String[] args){
        RandomGeneratorFactory factory = RandomGeneratorFactory.of("SecureRandom");
        RandomGenerator random = factory.create(200L);

        //get random numbers
        random.nextDouble();
    }
}
