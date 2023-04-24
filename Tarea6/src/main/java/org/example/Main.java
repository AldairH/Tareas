package org.example;

public class Main {
    public static void main(String[] args) {
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basket Ball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucali");
    }
}