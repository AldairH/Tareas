package org.example;

import java.awt.*;

public class Test  {
    public static void main(String[] args){
        Gato gato1 = new Gato("Pochi", "Amigable", (byte) 5, 24, Color.orange);
        System.out.println(gato1.jugar());
        System.out.println(gato1.durmiendo());
        System.out.println(gato1.comer());
        Pelota pelota1 = new Pelota("Golf", "Nueva", Color.red, "Poco", "Rugosa");
        System.out.println(pelota1.rebota());
        System.out.println(pelota1.aire());
        System.out.println(pelota1.rodar());
    }
}
