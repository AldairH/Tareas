package org.example.controlador;

import org.example.modelo.ModeloTablaReptil;
import org.example.modelo.Reptil;
import org.example.vista.Ventana;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControladorReptil extends MouseAdapter {
    private Ventana view;
    private ModeloTablaReptil modelo;

    public ControladorReptil(Ventana view) {
        this.view = view;
        modelo = new ModeloTablaReptil();
        this.view.getTblTablaReptil().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblTablaReptil().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getTblTablaReptil().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    int selectedRow = view.getTblTablaReptil().getSelectedRow();
                    if (selectedRow != -1){
                        String Nombre = view.getTblTablaReptil().getValueAt(selectedRow, 1).toString();
                        String Color = view.getTblTablaReptil().getValueAt(selectedRow, 2).toString();
                        String Habitat = view.getTblTablaReptil().getValueAt(selectedRow, 3).toString();
                        String Alimentacion = view.getTblTablaReptil().getValueAt(selectedRow, 4).toString();
                        String url = view.getTblTablaReptil().getValueAt(selectedRow, 5).toString();
                        view.getTxtNombreAc().setText(Nombre);
                        view.getTxtColorAc().setText(Color);
                        view.getTxtHabitatAc().setText(Habitat);
                        view.getTxtAlimentacionAc().setText(Alimentacion);
                        view.getTxtUrlAc().setText(url);
                    }
                }
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblTablaReptil().setModel(modelo);
            this.view.getTblTablaReptil().updateUI();
        }
        if(e.getSource() == this.view.getBtnAgregar()){
            Reptil reptil = new Reptil();
            reptil.setId(0);
            reptil.setNombre(this.view.getTxtNombre().getText());
            reptil.setColor(this.view.getTxtColor().getText());
            reptil.setHabitat(this.view.getTxtHabitat().getText());
            reptil.setAlimentacion(this.view.getTxtAlimentacion().getText());
            reptil.setUrl(this.view.getTxtUrl().getText());

            if (modelo.agregarReptil(reptil)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente UwU","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblTablaReptil().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Por favor revise su conexion UnU","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();

        if (e.getSource() == this.view.getTblTablaReptil()) {
            int filaSeleccionada = this.view.getTblTablaReptil().getSelectedRow();
            if (filaSeleccionada != -1) {
                String urlImagen = (String) modelo.getValueAt(filaSeleccionada, 5);

                try {
                    URL url = new URL(urlImagen);
                    ImageIcon imagen = new ImageIcon(url);
                    this.view.getLblImagen().setIcon(imagen);
                    this.view.getLblImagen().setText("");
                } catch (MalformedURLException ex) {
                    System.out.println("URL no valida");
                }
            }
        }
        if (e.getSource() == this.view.getBtnActualizar()) {
            int selectedRow = view.getTblTablaReptil().getSelectedRow();
            if (selectedRow != -1) {

                String nombre = view.getTxtNombreAc().getText();
                String color = view.getTxtColorAc().getText();
                String habitat = view.getTxtHabitatAc().getText();
                String alimentacion = view.getTxtAlimentacionAc().getText();
                String url = view.getTxtUrlAc().getText();

                int id = Integer.parseInt(view.getTblTablaReptil().getValueAt(selectedRow, 0).toString());

                Reptil reptilActualizado = new Reptil(id, nombre, color, habitat, alimentacion, url);
                    if (modelo.actualizarReptil(reptilActualizado)) {
                        JOptionPane.showMessageDialog(view, "Se actualizo correctamente OwO", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        view.limpiar();
                    } else {
                        JOptionPane.showMessageDialog(view, "No se pudo actualizar en la base de datos. Por favor revise su conexion UnU", "Error al actualizar", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        if (e.getSource() == this.view.getBtnEliminar()) {
            int opcion = JOptionPane.showConfirmDialog(view, "¿Estas seguro de que deseas eliminar el reptil seleccionado? :/", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                int selectedRow = view.getTblTablaReptil().getSelectedRow();
                if (selectedRow != -1) {
                    int id = Integer.parseInt(view.getTblTablaReptil().getValueAt(selectedRow, 0).toString());
                    if (modelo.eliminarReptil(id)) {
                        JOptionPane.showMessageDialog(view, "Se ha eliminado el reptil correctamente oWo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        this.view.getTblTablaReptil().updateUI();
                        this.view.limpiar();
                    } else {
                        JOptionPane.showMessageDialog(view, "No se pudo eliminar el reptil. Por favor, revise su conexion uNu", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Por favor, selecciona un reptil para eliminar :/", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
