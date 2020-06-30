package com.company;

import static com.company.ConversationManager.spanish;
import static com.company.ConversationManager.userAnswer;
import static com.company.HelpingMethods.*;

public class Displaying {

    static String welcoming() {
        String[] tabWelcom = {"Czesc!", "Witam!", "Dzien dobry!", "Jak sie masz?!", "Siema!"};
        return drawningFrom(tabWelcom);
    }

    static void say(String communicate) {
        System.out.println(communicate);
    }

    static void menuOptions() {
        say("O czym chcesz porozmawiać ???");
        String[] tabMenu = {"1. Porozmawiajmy", "2. Zakoncz"};

        for (String menu : tabMenu) {
            say(menu);
        }

    }

    static void displayFirstLetterWithUpperCase(String lang) {
        lang = Character.toUpperCase(lang.charAt(0)) + lang.substring(1) + "ego";

        say("Uczę się języka " + lang + "!");

    }

    static String goodbye() {
        int number = drawingNumber();

        if (spanish) {
            return userAnswer;
        }
        return textMultiplication(number);
    }

    private static String textMultiplication(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append("pa");

        }
        return stringBuilder + "!";
    }
}



