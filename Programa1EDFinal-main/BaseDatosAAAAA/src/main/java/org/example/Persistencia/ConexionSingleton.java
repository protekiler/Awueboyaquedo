package org.example.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection connection;

    public ConexionSingleton(String dataBase) {
        this.baseDatos = dataBase;
        try{
            connection= DriverManager.getConnection("jdbc:sqlite:BasePersona.db");
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ConexionSingleton getInstance(String baseDatos){
        if (_instance==null){
            _instance=new ConexionSingleton(baseDatos);

        }else {
            System.out.println("Ya fue creada");

        }
        return _instance;
    }

    public Connection getConection(){
        return connection;
    }
}