package edu.dmacc.codedsm.bakeryss;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Bakery natesBakery = new Bakery();
        System.out.println("natesBakery = " + natesBakery);

        Bakery pamsBakery =
            new Bakery(Arrays.asList(),
                    Arrays.asList("Pam"),
                    Arrays.asList(),
                    100000000.0d,
                    false);
        System.out.println("pamsBakery = " + pamsBakery);
    }

}
