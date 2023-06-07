package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblColor;
    private JLabel lblHabitat;
    private JLabel lblAlimentacion;
    private JLabel lblUrl;
    private JLabel lblIdAc;
    private JLabel lblNombreAc;
    private JLabel lblColorAc;
    private JLabel lblHabitatAc;
    private JLabel lblAlimentacionAc;
    private JLabel lblUrlAc;
    private JLabel lblImagen;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtColor;
    private JTextField txtHabitat;
    private JTextField txtAlimentacion;
    private JTextField txtUrl;
    private JTextField txtIdAc;
    private JTextField txtNombreAc;
    private JTextField txtColorAc;
    private JTextField txtHabitatAc;
    private JTextField txtAlimentacionAc;
    private JTextField txtUrlAc;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JTable tblTablaReptil;
    private JScrollPane scroll;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1750,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //PANEL 1 Formulario
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(255, 166, 166));
        lblId = new JLabel("Id");
        lblNombre = new JLabel("Nombre");
        lblColor = new JLabel("Color");
        lblHabitat = new JLabel("Habitat");
        lblAlimentacion = new JLabel("Alimentacion");
        lblUrl = new JLabel("URL");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(10);
        txtColor = new JTextField(10);
        txtHabitat = new JTextField(15);
        txtAlimentacion = new JTextField(15);
        txtUrl = new JTextField(20);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblColor);
        panel1.add(txtColor);
        panel1.add(lblHabitat);
        panel1.add(txtHabitat);
        panel1.add(lblAlimentacion);
        panel1.add(txtAlimentacion);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);


        //PANEL 2 Tabla
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(172, 255, 166));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblTablaReptil = new JTable();
        scroll = new JScrollPane(tblTablaReptil);
        panel2.add(scroll);

        //PANEL 3 Imagen
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(166, 255, 252));
        lblImagen = new JLabel();
        panel3.add(lblImagen);
        this.getContentPane().add(panel3, BorderLayout.CENTER);


        //PANEL 4 Delete y la otra wea
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(215, 166, 255));
        lblIdAc = new JLabel("Nuevo Id:");
        lblNombreAc = new JLabel("Nuevo Nombre:");
        lblColorAc = new JLabel("Nuevo Color:");
        lblHabitatAc = new JLabel("Nuevo Habitat:");
        lblAlimentacionAc = new JLabel("Nueva Alimentacion:");
        lblUrlAc = new JLabel("Nueva URL:");
        txtIdAc = new JTextField(3);
        txtIdAc.setText("0");
        txtIdAc.setEnabled(false);
        txtNombreAc = new JTextField(10);
        txtColorAc = new JTextField(10);
        txtHabitatAc = new JTextField(15);
        txtAlimentacionAc = new JTextField(15);
        txtUrlAc = new JTextField(20);
        btnActualizar = new  JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        panel4.add(lblIdAc);
        panel4.add(txtIdAc);
        panel4.add(lblNombreAc);
        panel4.add(txtNombreAc);
        panel4.add(lblColorAc);
        panel4.add(txtColorAc);
        panel4.add(lblHabitatAc);
        panel4.add(txtHabitatAc);
        panel4.add(lblAlimentacionAc);
        panel4.add(txtAlimentacionAc);
        panel4.add(lblUrlAc);
        panel4.add(txtUrlAc);
        panel4.add(btnActualizar);
        panel4.add(btnEliminar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public void limpiar(){
        txtNombre.setText("");
        txtColor.setText("");
        txtHabitat.setText("");
        txtAlimentacion.setText("");
        txtUrl.setText("");
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblColor() {
        return lblColor;
    }

    public void setLblColor(JLabel lblColor) {
        this.lblColor = lblColor;
    }

    public JLabel getLblHabitat() {
        return lblHabitat;
    }

    public void setLblHabitat(JLabel lblHabitat) {
        this.lblHabitat = lblHabitat;
    }

    public JLabel getLblAlimentacion() {
        return lblAlimentacion;
    }

    public void setLblAlimentacion(JLabel lblAlimentacion) {
        this.lblAlimentacion = lblAlimentacion;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxtHabitat() {
        return txtHabitat;
    }

    public void setTxtHabitat(JTextField txtHabitat) {
        this.txtHabitat = txtHabitat;
    }

    public JTextField getTxtAlimentacion() {
        return txtAlimentacion;
    }

    public void setTxtAlimentacion(JTextField txtAlimentacion) {
        this.txtAlimentacion = txtAlimentacion;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public JTable getTblTablaReptil() {
        return tblTablaReptil;
    }

    public void setTblTablaReptil(JTable tblTablaReptil) {
        this.tblTablaReptil = tblTablaReptil;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblIdAc() {
        return lblIdAc;
    }

    public void setLblIdAc(JLabel lblIdAc) {
        this.lblIdAc = lblIdAc;
    }

    public JLabel getLblNombreAc() {
        return lblNombreAc;
    }

    public void setLblNombreAc(JLabel lblNombreAc) {
        this.lblNombreAc = lblNombreAc;
    }

    public JLabel getLblColorAc() {
        return lblColorAc;
    }

    public void setLblColorAc(JLabel lblColorAc) {
        this.lblColorAc = lblColorAc;
    }

    public JLabel getLblHabitatAc() {
        return lblHabitatAc;
    }

    public void setLblHabitatAc(JLabel lblHabitatAc) {
        this.lblHabitatAc = lblHabitatAc;
    }

    public JLabel getLblAlimentacionAc() {
        return lblAlimentacionAc;
    }

    public void setLblAlimentacionAc(JLabel lblAlimentacionAc) {
        this.lblAlimentacionAc = lblAlimentacionAc;
    }

    public JLabel getLblUrlAc() {
        return lblUrlAc;
    }

    public void setLblUrlAc(JLabel lblUrlAc) {
        this.lblUrlAc = lblUrlAc;
    }

    public JTextField getTxtIdAc() {
        return txtIdAc;
    }

    public void setTxtIdAc(JTextField txtIdAc) {
        this.txtIdAc = txtIdAc;
    }

    public JTextField getTxtNombreAc() {
        return txtNombreAc;
    }

    public void setTxtNombreAc(JTextField txtNombreAc) {
        this.txtNombreAc = txtNombreAc;
    }

    public JTextField getTxtColorAc() {
        return txtColorAc;
    }

    public void setTxtColorAc(JTextField txtColorAc) {
        this.txtColorAc = txtColorAc;
    }

    public JTextField getTxtHabitatAc() {
        return txtHabitatAc;
    }

    public void setTxtHabitatAc(JTextField txtHabitatAc) {
        this.txtHabitatAc = txtHabitatAc;
    }

    public JTextField getTxtAlimentacionAc() {
        return txtAlimentacionAc;
    }

    public void setTxtAlimentacionAc(JTextField txtAlimentacionAc) {
        this.txtAlimentacionAc = txtAlimentacionAc;
    }

    public JTextField getTxtUrlAc() {
        return txtUrlAc;
    }

    public void setTxtUrlAc(JTextField txtUrlAc) {
        this.txtUrlAc = txtUrlAc;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

}
