package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surName;
        String color;
        int dayOfBirth;
        int monthOfBirth;
        int ageOfBirth;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome ");
        name = input.nextLine();

        System.out.print("Inserisci il tuo cognome ");
        surName = input.nextLine();

        System.out.print("Inserisci il tuo colore ");
        color = input.nextLine();

        // Scanner dateOfBirth = new Scanner(System.in);

        System.out.print("Inserisci il giorno di nascita ");
        dayOfBirth = input.nextInt();

        System.out.print("Inserisci il mese di nascita ");
        monthOfBirth = input.nextInt();

        System.out.print("Inserisci l'anno di nascita ");
        ageOfBirth = input.nextInt();

        // input.close();
        input.close();

        int datePass = dayOfBirth + monthOfBirth + ageOfBirth;
        String password = name + "-" + surName + "-" + color + "-" + datePass;

        System.out.println("la tua nuova password è: " + password);

    }
}
