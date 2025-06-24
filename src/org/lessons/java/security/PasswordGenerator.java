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

        Scanner inputDate = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome ");
        name = inputDate.nextLine();

        System.out.print("Inserisci il tuo cognome ");
        surName = inputDate.nextLine();

        System.out.print("Inserisci il tuo colore ");
        color = inputDate.nextLine();

        Scanner dateOfBirth = new Scanner(System.in);

        System.out.print("Inserisci il giorno di nascita ");
        dayOfBirth = dateOfBirth.nextInt();

        System.out.print("Inserisci il mese di nascita ");
        monthOfBirth = dateOfBirth.nextInt();

        System.out.print("Inserisci l'anno di nascita ");
        ageOfBirth = dateOfBirth.nextInt();

        inputDate.close();
        dateOfBirth.close();

        int datePass = dayOfBirth + monthOfBirth + ageOfBirth;
        String password = name + surName + color + datePass;

        System.out.println("la tua nuova password è: " + password);

    }
}
