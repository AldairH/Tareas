package org.example;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int idActivExtra;
    private String arte;
    private String deporte;

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActivExtra=" + idActivExtra +
                ", arte='" + arte + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }

    public int getIdActivExtra() {
        return idActivExtra;
    }

    public void setIdActivExtra(int idActivExtra) {
        this.idActivExtra = idActivExtra;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idActivExtra, String arte, String deporte) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idActivExtra = idActivExtra;
        this.arte = arte;
        this.deporte = deporte;
    }

    public AlumnoDeportistaArtista() {
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println("Esta presentando la obra...");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + "esta entrenando el deporte " + this.deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + "esta en competencia del deporte " + this.deporte);
        return false;
    }
}
