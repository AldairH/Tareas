package org.example.persistencia;

import org.example.modelo.Reptil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReptilDAO implements InterfazDAO{

    public ReptilDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Reptiles (Nombre, Color, Habitat, Alimentacion, Url) VALUES(?, ?, ?, ?, ?);";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Reptiles.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Reptil)obj).getNombre());
        pstm.setString(2,((Reptil)obj).getColor());
        pstm.setString(3,((Reptil)obj).getHabitat());
        pstm.setString(4,((Reptil)obj).getAlimentacion());
        pstm.setString(5,((Reptil)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlInsert = "UPDATE Reptiles SET Nombre = ?, Color= ?, Habitat= ?, Alimentacion=?, Url= ? WHERE id = ? ;";
        int rowCount =0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Reptiles.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Reptil)obj).getNombre());
        pstm.setString(2,((Reptil)obj).getColor());
        pstm.setString(3,((Reptil)obj).getHabitat());
        pstm.setString(4,((Reptil)obj).getAlimentacion());
        pstm.setString(5,((Reptil)obj).getUrl());
        pstm.setInt(6,((Reptil)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Reptiles WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Reptiles.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Reptiles";
        ArrayList<Reptil> resultado =new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("Reptiles.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Reptil(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        String sql = "SELECT * FROM Reptiles WHERE id = ?;";
        Reptil reptil = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("Reptiles.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet  rset = pstm.executeQuery();
        if (rset.next()){
            reptil =new Reptil(rset.getInt(1), rset.getString(2),rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6));
            return reptil;
        }
        return null;
    }
}