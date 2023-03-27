package org.example;

public class MaquinaDeCafe {
    private double agua;
    private double cafe;
    private double crema;
    private double vasos;

    public MaquinaDeCafe(){
        agua = 0;
        cafe = 0;
        crema = 0;
        vasos = 0;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        if(agua<=5000 && agua>=0){
            this.agua = agua;
        }

    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        if(cafe<=1000 && cafe>=0) {
            this.cafe = cafe;
        }
    }

    public double getCrema() {
        return crema;
    }

    public void setCrema(double crema) {
        if(crema<=1500 && crema>=0) {
            this.crema = crema;
        }
    }

    public double getVasos() {
        return vasos;
    }

    public void setVasos(double vasos) {
        if(vasos<=50 && vasos>=0){
            this.vasos = vasos;
        }
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }


    public void Americano(){
        if(agua >= 180 && cafe >= 15 && vasos > 0){
            agua -= 180;
            cafe -=15;
            vasos --;
            System.out.println("Su cafe Americano esta listo!");
            if (agua>=180 && cafe>=15 && vasos>0){
                System.out.println("Hay suficientes ingredientes para servir otro cafe Americano");
            }
            else{
                System.out.println("No hay suficientes ingredientes para servir otro cafe Americano");
            }
        }
        else{
            System.out.println("No hay suficientes ingredientes :c");
        }
    }
    public void Expreso(){
        if(agua >= 120 && cafe >= 20 && vasos > 0){
            agua -= 120;
            cafe -=20;
            vasos --;
            System.out.println("Su cafe Expreso esta listo!");
            if (agua>=120 && cafe>=20 && vasos>0){
                System.out.println("Hay suficientes ingredientes para servir otro cafe Expreso");
            }
            else{
                System.out.println("No hay suficientes ingredientes para servir otro cafe Expreso");
            }
        }
        else{
            System.out.println("No hay suficientes ingredientes :c");
        }
    }
    public void Capuchino(){
        if(agua >= 100 && cafe >= 14 && crema>=70 && vasos > 0){
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos --;
            System.out.println("Su Capuchino esta listo!");
            if (agua>=100 && cafe>=14 && crema>=70){
                System.out.println("Hay suficientes ingredientes para servir otro Chapuchino");
            }
            else{
                System.out.println("No hay suficientes ingredientes para servir otro Chapuchino");
            }
        }
        else{
            System.out.println("No hay suficientes ingredientes :c");
        }
    }
    public void IngredientesA(){
        System.out.println("Hay: " + agua + " ml de agua");
        System.out.println("Hay: " + cafe + " g de cafe");
        System.out.println("Hay: " + crema + " ml de crema");
        System.out.println("Hay: " + vasos + " vasos");
    }
}