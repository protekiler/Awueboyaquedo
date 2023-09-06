package org.example.Persistencia;
import org.example.modelo.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class PersonaDAO implements interfazDAO {
    public PersonaDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO Personas(Nombre,Apellido) VALUES(?,?)";
        int rowCount=0;
        PreparedStatement pstm=ConexionSingleton.getInstance("BasePersona.db").getConection().prepareStatement(sqlInsert);
        pstm.setString(1,((Persona)obj).getNombre());
        pstm.setString(2,((Persona)obj).getApellido());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Personas SET Nombre=?, Apellido=? WHERE id=?;"; // Agregamos el WHERE id=?
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("BasePersona.db").getConection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Persona) obj).getNombre());
        pstm.setString(2, ((Persona) obj).getApellido());
        pstm.setInt(3, ((Persona) obj).getId()); // Agregamos el ID
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql= "SELECT * FROM Personas";
        ArrayList<Persona> resultado=new ArrayList<>();
        Statement stm= ConexionSingleton.getInstance("BasePersona.db").getConection().createStatement();
        ResultSet rst= stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Persona(rst.getInt(1),rst.getString(2),rst.getString(3)));
        }
        return resultado;
    }

    @Override
    public boolean delete(String s) throws SQLException {
        String sqlDelete="DELETE FROM Personas WHERE id=?; ";
        int rowCount=0;
        PreparedStatement pstm=ConexionSingleton.getInstance("BasePersona.db").getConection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(s));
        rowCount= pstm.executeUpdate();
        return rowCount>0;
    }
}