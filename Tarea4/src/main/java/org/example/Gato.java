package org.example;

import java.awt.*;

public class Gato {
    private String nombre;
    private Color color;
    private byte edad;
    private float tamanio;
    private String caracter;


    public Gato(String nom, String car, byte ed, float tam, Color col) {
        nombre = nom;
        color = col;
        edad = ed;
        tamanio = tam;
        caracter = car;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color=" + color +
                ", edad=" + edad +
                ", tamanio=" + tamanio +
                ", caracter='" + caracter + '\'' +
                '}';
    }

    public boolean jugar(){
        System.out.println(nombre + " esta jugando c:");
        boolean res = Math.random() > 0.51;

        return res;
    }

    public boolean comer(){
        System.out.println(nombre + " esta comiendo O:");
        boolean res = Math.random() > 0.51;

        return res;
    }

    public boolean durmiendo(){
        System.out.println(nombre + " esta comiendo O:");
        boolean res = Math.random() < 0.51;

        return res;
    }

}