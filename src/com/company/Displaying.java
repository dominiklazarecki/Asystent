package com.company;

import static com.company.HelpingMethods.*;

public class Displaying {

    static String welcoming() {
        String[] tabWelcom = {"Czesc", "Witam", "Dzien dobry", "Jak sie masz", "Siema"};
        return drawningFrom(tabWelcom);
    }

    static void say(String communicate) {
        System.out.println(communicate);
    }

    static void menuOptions()
    {
        say("O czym chcesz porozmawiać ???");
        String[] tabMenu = {"1. Porozmawiajmy", "2. Zakoncz"};
        for (String menu : tabMenu) {
            say(menu);
        }

    }


}
