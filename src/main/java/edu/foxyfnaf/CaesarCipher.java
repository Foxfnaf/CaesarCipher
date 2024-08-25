package edu.foxyfnaf;

import java.util.Scanner;

public class CaesarCipher {
    private static String text = "";
    private static int shiftParameter = 0;

    public static String modeChoice() {
        Scanner userAnswerScanner = new Scanner(System.in);
        System.out.println("Wybierz tryb szyfrowanie/odszyfrowanie");
        String userAnswwer = userAnswerScanner.nextLine();

        switch (userAnswwer) {
            case "szyfrowanie" -> encrypt(text, shiftParameter);
            case "odszyfrowanie" -> decrypt(text, shiftParameter);
        }
        userAnswerScanner.close();

        return userAnswwer;
    }

    public static String encrypt(String text, int shiftParameter) {
        char[] textCharArray = text.toCharArray();
        shiftParameterChoice(shiftParameter);
        askUserForText(text);

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] + shiftParameter - 1);
        }
        String encryptedText = String.valueOf(textCharArray);
        System.out.println(encryptedText);
        return encryptedText;
    }

    public static String decrypt(String text, int shiftParameter) {
        char[] textCharArray = text.toCharArray();
        shiftParameterChoice(shiftParameter);
        askUserForText(text);

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] - shiftParameter + 1);
        }
        String decryptedText = String.valueOf(textCharArray);
        System.out.println(decryptedText);
        return decryptedText;
    }

    public static int shiftParameterChoice(int key) {
        Scanner shiftParameterScanner = new Scanner(System.in);

        System.out.println("Podaj parametr przesunięcia");
        key = shiftParameterScanner.nextInt();
        CaesarCipher.shiftParameter = key;
        shiftParameterScanner.close();

        return key;
    }

    public static String askUserForText(String text) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Podaj parametr przesunięcia");
        text = textScanner.nextLine();
        CaesarCipher.text = text;
        textScanner.close();

        return text;
    }

}
