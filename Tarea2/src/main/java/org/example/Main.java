package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = entrada.nextLine();
        boolean consec = true;
        for (int i = 0; i < cadena.length()-1 ; i++) {
            if ((int)cadena.charAt(i)+1 != (int)cadena.charAt(i+1)){
                consec = false;
                break;
            }
        }
        System.out.println(consec);
    }
}