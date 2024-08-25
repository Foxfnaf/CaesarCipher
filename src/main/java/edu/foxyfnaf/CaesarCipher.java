package edu.foxyfnaf;

import java.util.Scanner;

public class CaesarCipher {

    private static String TEXT = "";
    private static int SHIFT_PARAMETER = 0;

    public static String modeChoice() {
        Scanner userAnswerScanner = new Scanner(System.in);
        System.out.println("Wybierz tryb szyfrowanie/odszyfrowanie");
        String userAnswwer = userAnswerScanner.nextLine();

        switch (userAnswwer) {
            case "szyfrowanie" -> encrypt(TEXT, SHIFT_PARAMETER);
            case "odszyfrowanie" -> decrypt(TEXT, SHIFT_PARAMETER);
        }
        userAnswerScanner.close();

        return userAnswwer;
    }

    public static String encrypt(String TEXT, int SHIFT_PARAMETER) {
        char[] textCharArray = TEXT.toCharArray();
        shiftParameterChoice(SHIFT_PARAMETER);
        askUserForText(TEXT);

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] + SHIFT_PARAMETER - 1);
        }
        String encryptedText = String.valueOf(textCharArray);
        System.out.println(encryptedText);
        return encryptedText;
    }

    public static String decrypt(String TEXT, int SHIFT_PARAMETER) {
        char[] textCharArray = TEXT.toCharArray();
        shiftParameterChoice(SHIFT_PARAMETER);
        askUserForText(TEXT);

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] - SHIFT_PARAMETER + 1);
        }
        String decryptedText = String.valueOf(textCharArray);
        System.out.println(decryptedText);
        return decryptedText;
    }

    public static int shiftParameterChoice(int key) {
        Scanner shiftParameterScanner = new Scanner(System.in);

        System.out.println("Podaj parametr przesunięcia");
        key = shiftParameterScanner.nextInt();
        CaesarCipher.SHIFT_PARAMETER = key;
        shiftParameterScanner.close();

        return key;
    }

    public static String askUserForText(String text) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Podaj parametr przesunięcia");
        text = textScanner.nextLine();
        CaesarCipher.TEXT = text;
        textScanner.close();

        return text;
    }

}
