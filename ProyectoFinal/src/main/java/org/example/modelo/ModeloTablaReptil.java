package org.example.modelo;

import org.example.persistencia.ReptilDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaReptil implements TableModel {

    public static final int COLUMNAS = 6;
    private ArrayList<Reptil> datos;
    private ReptilDAO repdao;

    public ModeloTablaReptil(){
        repdao = new ReptilDAO();
        datos = new ArrayList<>();
    }
    public ModeloTablaReptil(ArrayList<Reptil> datos){
        this.datos = datos;
        repdao =  new ReptilDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "id";
            case 1:
                return "Nombre";
            case 2:
                return "Color";
            case 3:
                return "Habitat";
            case 4:
                return "Alimentacion";
            case 5:
                return "Url";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reptil tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getColor();
            case 3:
                return tmp.getHabitat();
            case 4:
                return tmp.getAlimentacion();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setColor((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setHabitat((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setAlimentacion((String) aValue);
            case 5:
                datos.get(rowIndex).setUrl((String)  aValue);
            default:
                System.out.println("No se modifico nada :/");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            datos = repdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarReptil(Reptil reptil){
        boolean resultado = false;
        try {
            if(repdao.insertar(reptil)){
                datos.add(reptil);
                resultado = true;
            } else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean actualizarReptil(Reptil reptil) {
        try {
            return repdao.update(reptil);
        } catch (SQLException e) {
            e.printStackTrace(); // Opcionalmente, puedes mostrar un mensaje de error o registrar la excepción
            return false;
        }
    }
    public boolean eliminarReptil(int id) {
        try {
            String idString = Integer.toString(id); // Convertir el int a String
            if (repdao.delete(idString)) {
                datos.removeIf(reptil -> reptil.getId() == id);
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el reptil: " + e.getMessage());
            return false;
        }
    }
}
