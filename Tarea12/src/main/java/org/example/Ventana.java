package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel Panel1;
    private JPanel Panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<VideoJuego> info;
    private JScrollPane Scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);
        //Panel 1
        Panel1 = new JPanel(new FlowLayout());
        Panel1.setBackground(new Color(188,227,166));
        lblId = new JLabel("Id: ");
        txtId = new JTextField(4);
        Panel1.add(lblId);
        Panel1.add(txtId);
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        Panel1.add(lblNombre);
        Panel1.add(txtNombre);
        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(15);
        Panel1.add(lblGenero);
        Panel1.add(txtGenero);
        lblPeso = new JLabel("Peso (GB): ");
        txtPeso = new JTextField(5);
        Panel1.add(lblPeso);
        Panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(15);
        Panel1.add(lblPlataforma);
        Panel1.add(txtPlataforma);
        lblDesarrollador = new JLabel("Desarrollador: ");
        txtDesarrollador = new JTextField(25);
        Panel1.add(lblDesarrollador);
        Panel1.add(txtDesarrollador);
        btnAgregar = new JButton("Agregar Juego");
        Panel1.add(btnAgregar);


        this.getContentPane().add(Panel1,0);

        //Panel 2
        Panel2 = new JPanel(new FlowLayout());
        Panel2.setBackground(new Color(201, 195, 241));
        info = new ArrayList<>();
        info.add(new VideoJuego(1,"Legue of Legends", "MOBA",
                4.5,"PC", "RIOT Games"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        Scroll = new JScrollPane(tblTabla);
        Panel2.add(Scroll);

        this.getContentPane().add(Panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoEnGb(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrollador.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });
        this.setVisible(true);
    }
}