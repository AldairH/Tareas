package org.example;

public class Main {
    public static void main(String[] args) {

        MaquinaDeCafe MCafe = new MaquinaDeCafe();
        MCafe.setAgua(5000);//Se me ocurrio declarar los valeres de los contenedores llenos por defecto, pero así fue como lo entendi en la descripción de la tarea
        MCafe.setCafe(1000);
        MCafe.setCrema(1500);
        MCafe.setVasos(50);
        MCafe.IngredientesA();//Cantidad inicial de ingredintes
        while(MCafe.getCrema()>70){
            MCafe.Capuchino();
        }
        MCafe.IngredientesA();//Cantidad de Ingredientes despues de servir cafes c:
    }

}