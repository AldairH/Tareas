package org.example.modelo;

public class Reptil {
    private int Id;
    private String Nombre;
    private String Color;
    private String Habitat;
    private String Alimentacion;
    private String Url;

    public Reptil(int id, String nombre, String color, String habitat, String alimentacion, String url) {
        Id = id;
        Nombre = nombre;
        Color = color;
        Habitat = habitat;
        Alimentacion = alimentacion;
        Url = url;
    }

    public Reptil() {
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Color='" + Color + '\'' +
                ", Habitat='" + Habitat + '\'' +
                ", Alimentacion='" + Alimentacion + '\'' +
                ", Url='" + Url + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        Alimentacion = alimentacion;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
