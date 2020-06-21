package com.company;

import java.util.Random;

public class HelpingMethods {

    static String drawningFrom(String[] tab)
    {
        Random random = new Random();
        return tab[random.nextInt(tab.length)];
    }

}
