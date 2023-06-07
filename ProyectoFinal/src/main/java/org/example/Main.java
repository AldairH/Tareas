package org.example;

import org.example.controlador.ControladorReptil;
import org.example.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana view = new Ventana("VentanaReptil");
        ControladorReptil controller = new ControladorReptil(view);
    }
}