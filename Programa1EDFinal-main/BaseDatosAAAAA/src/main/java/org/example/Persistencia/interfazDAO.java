package org.example.Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface interfazDAO {
    public abstract boolean insertar(Object obj) throws SQLException;
    public abstract boolean update(Object obj) throws SQLException;
    public abstract ArrayList obtenerTodo() throws SQLException;
    public abstract boolean delete(String s) throws SQLException;
}
