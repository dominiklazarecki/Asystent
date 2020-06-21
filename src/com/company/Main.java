package com.company;

import java.util.Scanner;

import static com.company.Displaying.*;

public class Main {

    static boolean ifEndProgram;

    public static void main(String[] args) {
        talking();
    }

    private static void talking() {
        say(welcoming());
        menuRepeating();
    }

    private static void menuRepeating() {
        while (!ifEndProgram) {
            menu();
        }
    }

    private static void menu() {
        menuOptions();
        menuSwitcher();
    }

    private static void menuSwitcher() {


        switch (takeOptionsFromUser()) {
            case 1:
                say("Wybrano opje nr 1. Porozmawiajmy");
                break;
            default:
                ifEndProgram = true;
                say("Program zakonczony!");

        }
    }

    private static int takeOptionsFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
