package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres: ");
        String cadena = entrada.nextLine();
        if (cadena.length() != 9) {
            System.out.println("La cadena debe de tener exactamente 9 caracteres.");
            return;
        }
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] != 'X' && caracteres[i] != 'O' && caracteres[i] != '_') {
                System.out.println("La cadena solo puede contener los caracteres X, O, _.");
                return;
            }
        }
        System.out.println("________");
        System.out.println("|" + " " + caracteres[0] + " " + caracteres[1] + " " + caracteres[2] + "|");
        System.out.println("|" + " " + caracteres[3] + " " + caracteres[4] + " " + caracteres[5] + "|");
        System.out.println("|" + " " + caracteres[6] + " " + caracteres[7] + " " + caracteres[8] + "|");
        System.out.println("--------");
    }
}