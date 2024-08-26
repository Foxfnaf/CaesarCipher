package edu.foxyfnaf;

import java.util.Scanner;

public class CaesarCipher {
    private  String text;
    private  int shiftParameter;
    Scanner scanner;

    public String modeChoice(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("UWAGA! szyfrowanie i deszyfrowanie odbywa się zza pomocą angielskiego alfabetu");
        System.out.println("Wybierz tryb szyfrowanie/odszyfrowanie");
        String userAnswwer = scanner.nextLine();

        switch (userAnswwer) {
            case "szyfrowanie" -> encrypt(shiftParameter);
            case "odszyfrowanie" -> decrypt(shiftParameter);
        }

        return userAnswwer;
    }

    public  String encrypt(int shiftParameter) {
        shiftParameter = shiftParameterChoice();
        String input = askUserForText();
        char[] textCharArray = input.toCharArray();


        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] + shiftParameter - 1);
        }
        String encryptedText = String.valueOf(textCharArray);
        System.out.println(encryptedText);
        return encryptedText;
    }

    public  String decrypt(int shiftParameter) {
        shiftParameterChoice();
        String input = askUserForText();
        char[] textCharArray = input.toCharArray();

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] - shiftParameter + 1);
        }
        String decryptedText = String.valueOf(textCharArray);
        System.out.println(decryptedText);
        return decryptedText;
    }

    public  int shiftParameterChoice() {
        System.out.println("Podaj parametr przesunięcia");
        shiftParameter = scanner.nextInt();
        scanner.nextLine();

        return shiftParameter;
    }

    public  String askUserForText() {
        System.out.println("Podaj tekst");
        text = scanner.nextLine();

        System.out.println(text);
        return text;
    }
}
