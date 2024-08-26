package edu.foxyfnaf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.modeChoice(sc);

        sc.close();
    }
}