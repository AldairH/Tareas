package org.example;

import java.awt.*;
public class Pelota {

    private String deporte;
    private String condicion;
    private Color color;
    private String rebote;
    private String textura;

    public Pelota(String dep, String con, Color col, String reb, String tex){
        deporte = dep;
        condicion = con;
        color = col;
        rebote = reb;
        textura = tex;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getRebote() {
        return rebote;
    }

    public void setRebote(String rebote) {
        this.rebote = rebote;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "deporte='" + deporte + '\'' +
                ", condicion='" + condicion + '\'' +
                ", color=" + color +
                ", rebote='" + rebote + '\'' +
                ", textura='" + textura + '\'' +
                '}';
    }

    public boolean rebota(){
        System.out.println("La pelota de " + deporte + " esta rebotando: ");
        boolean res = Math.random() < 0.51;
        return res;
    }
    public boolean rodar(){
        System.out.println("La pelota de " + deporte + " esta rodando: ");
        boolean res = Math.random() < 0.51;
        return res;
    }
    public boolean aire(){
        System.out.println("La pelota de " + deporte + " esta en el aire: ");
        boolean res = Math.random() < 0.51;
        return res;
    }
}
