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
        shiftParameterChoice();
        askUserForText();

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] + shiftParameter - 1);
        }
        String encryptedText = String.valueOf(textCharArray);
        System.out.println(encryptedText);
        return encryptedText;
    }

    public static String decrypt(String text, int shiftParameter) {
        char[] textCharArray = text.toCharArray();
        shiftParameterChoice();
        askUserForText();

        for (int i = 0; i < textCharArray.length; i++) {
            textCharArray[i] = (char) (textCharArray[i] - shiftParameter + 1);
        }
        String decryptedText = String.valueOf(textCharArray);
        System.out.println(decryptedText);
        return decryptedText;
    }

    public static int shiftParameterChoice() {
        Scanner shiftParameterScanner = new Scanner(System.in);

        System.out.println("Podaj parametr przesunięcia");
        CaesarCipher.shiftParameter = shiftParameterScanner.nextInt();
        shiftParameterScanner.close();

        return CaesarCipher.shiftParameter;
    }

    public static String askUserForText() {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Podaj tekst");
        CaesarCipher.text = textScanner.nextLine();

        textScanner.close();

        return CaesarCipher.text;
    }

}
