package com.company;

import static com.company.Displaying.*;
import static com.company.HelpingMethods.*;

public class ConversationManager {

    static String userAnswer;
    static boolean spanish;

    static void converse() {
        String lang = languageDrawing();
        displayFirstLetterWithUpperCase(lang);

        say(languageQestionAsking(lang));
        userAnswer = answerGiving();

    }

    static String languageDrawing() {
        String[] langPoll = {"polski", "angielski", "hiszpanski"};
        return drawningFrom(langPoll);
    }
// ctrl + D - uśmiercanie programu
    static String languageQestionAsking(String lang) {
        String question = "";

        switch (lang) {
            case "polski":
                question = "Jaki jest synonim słowa miło?";
                break;
            case "angielski":
                question = ("Jak powiedzieć po angieslku, że coś nie wyszło?");
                break;
            case "hiszpanski":
                question = ("Jak powiedzieć \"cześć\" po hiszpańsku?");
                spanish = true;
        }
        return question;
    }

    static String answerGiving() {
        String answer = answerInputting();
        say("Dziękuje za odpowiedź!");
        return answer;
    }


}
