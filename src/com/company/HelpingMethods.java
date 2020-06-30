package com.company;

import java.util.Random;
import java.util.Scanner;

public class HelpingMethods {

    static String lang;

    static String drawningFrom(String[] tab) {
        Random random = new Random();
        String lang = tab[random.nextInt(tab.length)];
        return lang;
    }


    static String answerInputting() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    static int drawingNumber()
    {
        Random random = new Random();
        int number = random.nextInt(10)+1;
        return number;
    }


}
